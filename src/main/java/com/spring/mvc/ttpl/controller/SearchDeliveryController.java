package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nzepa on 2/25/2020.
 */
@Controller
@RequestMapping("/searchDelivery")
public class SearchDeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/searchDelivery";
    }


    @ResponseBody
    @RequestMapping(value = "/getSenderInfo", method = RequestMethod.GET)
    public ResponseMessage getSenderInfo(String cidNumber) throws Exception {
        responseMessage = deliveryService.getSenderInfo(cidNumber);
        return responseMessage;
    }
}
