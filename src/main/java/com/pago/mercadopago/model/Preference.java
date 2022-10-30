package com.pago.mercadopago.model;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Preference {
    /*
    private String description;//pago por producto
    private String external_reference;//referencia externa
    private String installments;//cuotas
    private String payment_method_id;//ID del método de pago
    private Integer transaction_amount;//cantidad de transacción
    */

    private String token;
    private String issuerId;//id del emisor
    List<Item> itemList;


}
