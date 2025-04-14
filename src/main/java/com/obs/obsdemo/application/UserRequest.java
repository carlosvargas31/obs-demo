package com.obs.obsdemo.application;

public record UserRequest(
        String firstName, String lastName, String email, String gender, AddressRequest address, CardRequest card, Boolean marriedStatus
) {

    public record AddressRequest(String city, String state, String country, String countryCode) { }

    public record CardRequest(String cardNumber, String cardType, String currencyCode, String balance) { }

}
