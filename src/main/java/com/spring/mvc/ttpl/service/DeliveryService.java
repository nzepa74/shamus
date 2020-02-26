package com.spring.mvc.ttpl.service;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.DeliveryDao;
import com.spring.mvc.ttpl.dto.DeliveryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by nzepa on 2/25/2020.
 */
@Service
public class DeliveryService {
    @Autowired
    private DeliveryDao deliveryDao;

    public ResponseMessage saveDelivery(DeliveryDTO deliveryDTO) {
        ResponseMessage responseMessage = new ResponseMessage();

        DeliveryEntity deliveryEntity = new DeliveryEntity();

        deliveryEntity.setCidNumber(deliveryDTO.getCidNumber());
        deliveryEntity.setSenderName(deliveryDTO.getReceiverName());
        deliveryEntity.setMobileNumber(deliveryDTO.getMobileNumber());
        deliveryEntity.setItemName(deliveryDTO.getItemName());
        deliveryEntity.setPlaceFrom(deliveryDTO.getPlaceFrom());
        deliveryEntity.setPlaceTo(deliveryDTO.getPlaceTo());
        deliveryEntity.setDistance(deliveryDTO.getDistance());
        deliveryEntity.setItemWeight(deliveryDTO.getItemWeight());
        deliveryEntity.setReceiverName(deliveryDTO.getReceiverName());
        deliveryEntity.setMobileNumber1(deliveryDTO.getMobileNumber1());
        deliveryEntity.setLocation(deliveryDTO.getLocation());
        deliveryEntity.setDriverName(deliveryDTO.getDriverName());
        deliveryEntity.setVechileNumber(deliveryDTO.getVechileNumber());
        deliveryEntity.setDeliveryStatus('P');
        deliveryEntity.setSetDate(new Date());

        String cid = deliveryDTO.getCidNumber();
        String validCid = deliveryDao.checkDuplicateCid(cid);

        if (validCid != null) {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("Already Exits");
            return responseMessage;
        }

        deliveryDao.saveDelivery(deliveryEntity);
        responseMessage.setResponseStatus(1);
        responseMessage.setResponseText("sucessful");

        return responseMessage;
    }


    public ResponseMessage getSenderInfo(String cidNumber) {

        ResponseMessage responseMessage = new ResponseMessage();
        DeliveryDTO deliveryDTO= deliveryDao.getSenderInfo(cidNumber);

        if (deliveryDTO != null) {
            responseMessage.setResponseDTO(deliveryDTO);
            responseMessage.setResponseStatus(1);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching " + cidNumber + " .Please " +
                    "search with different name");
        }
        return responseMessage;
    }
}
