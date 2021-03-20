package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.model.PaymentListResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class PaymentController {

  @RequestMapping(
      method = RequestMethod.GET,
      path = "/payment",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<PaymentListResponse> getPaymentMethods() {
    return null;
  }
}
