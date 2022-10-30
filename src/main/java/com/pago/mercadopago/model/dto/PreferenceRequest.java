package com.pago.mercadopago.model.dto;

import com.pago.mercadopago.model.Item;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PreferenceRequest {

    private String token;
    private String issuerId;//id del emisor
    List<ItemRequest> itemList;
}
