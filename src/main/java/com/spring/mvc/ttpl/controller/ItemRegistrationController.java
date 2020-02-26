package com.spring.mvc.ttpl.controller;

import com.spring.mvc.enumeration.SystemDataInt;
import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.dto.ItemRegistrationDTO;
import com.spring.mvc.ttpl.service.ItemRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nzepa on 2/17/2020.
 */
@Controller
@RequestMapping("/itemRegistration")
public class ItemRegistrationController {
    @Autowired
    private ItemRegistrationService itemRegistrationService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {

        return "ttpl/itemRegistration";//JSP
    }

    @ResponseBody
    @RequestMapping(value = "/saveItem", method = RequestMethod.POST)
    public ResponseMessage saveItem(HttpServletRequest request, HttpServletResponse response,
                                    ItemRegistrationDTO itemRegistrationDTO)
            throws Exception {
        responseMessage = itemRegistrationService.saveItem(itemRegistrationDTO);
        return responseMessage;
    }
}
