package com.obs.obsdemo.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
public class Card {

    @Field("card_number")
    private String cardNumber;
    @Field("card_type")
    private String cardType;
    @Field("currency_code")
    private String currencyCode;
    private BigDecimal balance;

}
