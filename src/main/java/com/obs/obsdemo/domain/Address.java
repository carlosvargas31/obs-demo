package com.obs.obsdemo.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Address {

    private String city;
    private String state;
    private String country;
    @Field("country_code")
    private String countryCode;

}
