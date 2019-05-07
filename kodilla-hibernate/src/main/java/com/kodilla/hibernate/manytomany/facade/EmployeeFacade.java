package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    public void processSearching(final String name) throws EmployeeProcessingException {
        if (name.equals("")) {
            LOGGER.error(EmployeeProcessingException.ERR_NAME_NULL);
            throw new EmployeeProcessingException(EmployeeProcessingException.ERR_NAME_NULL);
        }
        try {
            LOGGER.info("Searching employees that name contains: " + name);
            List<Employee> employeeList = employeeDao.retrieveEmployeeWithName("%" + name + "%");
            if (employeeList.size() == 0) {
                LOGGER.error(EmployeeProcessingException.ERR_NOT_FOUND);
                throw new EmployeeProcessingException(EmployeeProcessingException.ERR_NOT_FOUND);
            }
            for (Employee employees : employeeList) {
                String employee = employees.getFirstname() + " " + employees.getLastname();
                System.out.println(employee);
            }
        } finally {
            LOGGER.info("Searching finished");
        }
    }
}
