package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeFacadeTestSuite {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void testRetrieveEmployeeWithName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        //When
        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaKovalskyId = lindaKovalsky.getId();

        try {
            employeeFacade.processSearching("Joh");
        } catch (EmployeeProcessingException e) {
            System.out.println(e);
        }
        //CleanUp
        employeeDao.delete(johnSmithId);
        employeeDao.delete(stephanieClarcksonId);
        employeeDao.delete(lindaKovalskyId);
    }
}
