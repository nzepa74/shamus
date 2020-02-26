package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.dto.DeliveryDTO;
import com.spring.mvc.ttpl.dto.LeaveDTO;
import com.spring.mvc.ttpl.entity.EmployeeEntity;
import com.spring.mvc.ttpl.service.DeliveryEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nzepa on 2/25/2020.
 */
@Repository
public class DeliveryDao extends BaseDao{
    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveDelivery(DeliveryEntity deliveryEntity) {
            em.persist(deliveryEntity);
    }


    @Transactional(readOnly = true)
    public String checkDuplicateCid(String cid) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.checkDuplicateCidDelivery");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("cidNo", cid);
        return (String) hQuery.uniqueResult();
    }

    @Transactional(readOnly = true)
    public DeliveryDTO getSenderInfo(String cidNumber) {
        String query = properties.getProperty("ChargeAllocationDao.getSenderInfo");
        org.hibernate.Query hQuery = hibernateQuery(query, DeliveryDTO.class);
        hQuery.setParameter("cidNumber", cidNumber);
        return (DeliveryDTO) hQuery.uniqueResult();
    }

}
