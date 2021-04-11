package com.upgrad.FoodOrderingApp.api.aspect;

import com.upgrad.FoodOrderingApp.api.model.ErrorResponse;
import com.upgrad.FoodOrderingApp.service.exception.PaymentMethodNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class PaymentMethodNotFoundExceptionAspect {

  @ExceptionHandler(PaymentMethodNotFoundException.class)
  public ResponseEntity<ErrorResponse> PaymentMethodNotFoundException(
      PaymentMethodNotFoundException exc, WebRequest request) {
    return new ResponseEntity<>(
        new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()),
        HttpStatus.NOT_FOUND);
  }
}
