package com.obs.obsdemo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("users")
public class User {

    @Id
    private String id;
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
    private String email;
    private String gender;
    private Address address;
    private Card card;
    @Field("married_status")
    private Boolean marriedStatus;

}
