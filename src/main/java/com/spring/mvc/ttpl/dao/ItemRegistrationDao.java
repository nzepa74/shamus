package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.entity.ItemRegistrationEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nzepa on 2/17/2020.
 */
@Repository
public class ItemRegistrationDao extends BaseDao {
    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveItem(ItemRegistrationEntity itemRegistrationEntity) {
        em.persist(itemRegistrationEntity);
    }
}
