package com.upgrad.FoodOrderingApp.api.controller;

import com.upgrad.FoodOrderingApp.api.model.*;
import com.upgrad.FoodOrderingApp.service.exception.AddressNotFoundException;
import com.upgrad.FoodOrderingApp.service.exception.AuthorizationFailedException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/")
public class AddressController {

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/address",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<SaveAddressResponse> saveAddress(
      @RequestHeader("authorization") final String authorization,
      final SaveAddressRequest saveAddressRequest) {
    return null;
  }

  @RequestMapping(
      method = RequestMethod.GET,
      path = "/address/customer",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<AddressListResponse> getAllSavedAddresses(
      @RequestHeader("authorization") final String authorization)
      throws AuthorizationFailedException {
    return null;
  }

  @RequestMapping(
      method = RequestMethod.DELETE,
      path = "/address/{address_id}",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<DeleteAddressResponse> deleteSavedAddress(
      @PathVariable("address_id") final String address_id,
      @RequestHeader("authorization") final String authorization)
      throws AuthorizationFailedException, AddressNotFoundException {
    return null;
  }

  @RequestMapping(
      method = RequestMethod.GET,
      path = "/states",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<StatesListResponse> getAllStates() {
    return null;
  }
}
