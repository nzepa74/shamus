package com.spring.mvc.ttpl.service;

import com.spring.mvc.enumeration.SystemDataInt;
import com.spring.mvc.helper.BeanValidator;
import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.ItemRegistrationDao;
import com.spring.mvc.ttpl.dto.ItemRegistrationDTO;
import com.spring.mvc.ttpl.entity.ItemRegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by nzepa on 2/17/2020.
 */
@Service
public class ItemRegistrationService {
    @Autowired
    private ItemRegistrationDao itemRegistrationDao;
    BeanValidator beanValidator;

    public ResponseMessage saveItem(ItemRegistrationDTO itemRegistrationDTO) {
        ResponseMessage responseMessage = new ResponseMessage();

        ItemRegistrationEntity itemRegistrationEntity = convertDTOtoEntity(itemRegistrationDTO);

        itemRegistrationDao.saveItem(itemRegistrationEntity);
        responseMessage.setResponseStatus(SystemDataInt.MESSAGE_STATUS_SUCCESSFUL.value());
        responseMessage.setResponseText("Sucessfuly saved");
        return responseMessage;
    }

    private ItemRegistrationEntity convertDTOtoEntity(ItemRegistrationDTO itemRegistrationDTO) {
        ItemRegistrationEntity itemRegistrationEntity = new ItemRegistrationEntity();
        itemRegistrationEntity.setItemCode(itemRegistrationDTO.getItemCode());
        itemRegistrationEntity.setItemName(itemRegistrationDTO.getItemName());
        itemRegistrationEntity.setItemBrand(itemRegistrationDTO.getItemBrand());
        itemRegistrationEntity.setItemModel(itemRegistrationDTO.getItemBrand());
        itemRegistrationEntity.setMfgDate(itemRegistrationDTO.getMfgDate());
        itemRegistrationEntity.setExpiryDate(itemRegistrationDTO.getExpiryDate());
        itemRegistrationEntity.setItemStatus(itemRegistrationDTO.getItemStatus());
        itemRegistrationEntity.setRegistrationDate(new Date());
        return itemRegistrationEntity;

    }
}
