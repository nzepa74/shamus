package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.CurrentUser;
import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.ChargeAllocationDTO;
import com.spring.mvc.ttpl.dto.DeliveryDTO;
import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nzepa on 2/25/2020.
 */
@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/delivery";
    }

    @ResponseBody
    @RequestMapping(value = "/saveDelivery", method = RequestMethod.POST)
    public ResponseMessage saveDelivery(HttpServletRequest request, HttpServletResponse response,
                                        DeliveryDTO deliveryDTO)
            throws Exception {
        responseMessage = deliveryService.saveDelivery(deliveryDTO);
        return responseMessage;
    }

}
