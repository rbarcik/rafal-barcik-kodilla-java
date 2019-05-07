package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    @Autowired
    private CompanyDao companyDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public void processSearching(final String name) throws CompanyProcessingException{
        if (name.equals("")) {
            LOGGER.error(CompanyProcessingException.ERR_NAME_NULL);
            throw new CompanyProcessingException(CompanyProcessingException.ERR_NAME_NULL);
        }
        try {
            LOGGER.info("Searching company that name contains: " + name);
            List<Company> companyList = companyDao.retrieveCompaniesWithNames(name);
            if (companyList.size() == 0) {
                LOGGER.error(CompanyProcessingException.ERR_NOT_FOUND);
                throw new CompanyProcessingException(CompanyProcessingException.ERR_NOT_FOUND);
            }
            companyList.stream()
                    .map(company -> company.getName())
                    .forEach(System.out::println);
        } finally {
            LOGGER.info("Searching finished");
        }
    }
}
