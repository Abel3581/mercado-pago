package com.pago.mercadopago.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Item {

    @NotEmpty
    private String title;
    private String description;
    private String picture_url;
    private String category_id;
    @NotEmpty
    private Integer quantity;
    private String currency_id;//USD,ARS
    @NotEmpty
    private BigDecimal unit_price;

}
