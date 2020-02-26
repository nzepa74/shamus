package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.LeaveDTO;
import com.spring.mvc.ttpl.dto.TaxPayerRegistrationDTO;
import com.spring.mvc.ttpl.service.LeaveService;
import com.spring.mvc.ttpl.service.TaxPayerRegistrationService;
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
@RequestMapping("/taxPayerRegistration")
public class TaxPayerRegistrationController {
    @Autowired
    private TaxPayerRegistrationService taxPayerRegistrationService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/taxPayerRegistration";
    }

    @ResponseBody
    @RequestMapping(value = "/registerTaxPayer", method = RequestMethod.POST)
    public ResponseMessage registerTaxPayer(HttpServletRequest request, HttpServletResponse response,
                                     TaxPayerRegistrationDTO taxPayerRegistrationDTO) throws Exception {
        responseMessage = taxPayerRegistrationService.registerTaxPayer(taxPayerRegistrationDTO);
        return responseMessage;
    }

}
