package com.pago.mercadopago.controller;

import com.pago.mercadopago.model.dto.PreferenceRequest;
import com.pago.mercadopago.model.dto.PreferenceResponse;
import com.pago.mercadopago.service.abstraction.PreferenceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/checkout")
public class PreferenceController {

   @Autowired
   private PreferenceService preferenceService;

   @PostMapping("/preferences")
   public ResponseEntity<PreferenceResponse> preference(@RequestBody @Valid PreferenceRequest request){
      PreferenceResponse response = preferenceService.preference(request);
      return ResponseEntity.status(HttpStatus.CREATED).body(response);
   }
}
