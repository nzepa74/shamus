package com.spring.mvc.ttpl.service;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.EmployeeDao;
import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by nzepa on 2/5/2020.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public ResponseMessage saveEmployee(EmployeeDTO employeeDTO) {

        ResponseMessage responseMessage = new ResponseMessage();

        String cidNo = employeeDTO.getCidNumber();
        String validCid = employeeDao.checkDuplicateCid(cidNo);
        if (validCid != null) {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("CID number " + cidNo + " already exist.");
            return responseMessage;
        } else {
            EmployeeEntity employeeEntity = convertDtoToEntity(employeeDTO);
            employeeDao.saveEmployee(employeeEntity);
            responseMessage.setResponseStatus(1);
            responseMessage.setResponseText("Saved Successfully. Thank you");
        }
        return responseMessage;
    }


    private EmployeeEntity convertDtoToEntity(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setCidNumber(employeeDTO.getCidNumber());
        employeeEntity.setEmployeeName(employeeDTO.getEmployeeName());
        employeeEntity.setMobileNumber(employeeDTO.getMobileNumber());
        employeeEntity.setEmailAddress(employeeDTO.getEmailAddress());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        return employeeEntity;
    }


}
