package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nzepa on 2/5/2020.
 */
@Repository
public class EmployeeDao extends BaseDao{

    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveEmployee(EmployeeEntity employeeEntity ) {
        em.persist(employeeEntity);
    }

    @Transactional(readOnly = true)
    public String checkDuplicateCid(String cidNo) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.checkDuplicateCid");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("cidNo", cidNo);
        return (String) hQuery.uniqueResult();
    }

}
