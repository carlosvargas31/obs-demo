package com.obs.obsdemo.application;

import com.obs.obsdemo.domain.Address;
import com.obs.obsdemo.domain.Card;
import com.obs.obsdemo.domain.User;

public class UserMapper {

    public static User mapUserRequestToUser(UserRequest userRequest) {
        User user = new User();
        user.setFirstName(userRequest.firstName());
        user.setLastName(userRequest.lastName());
        user.setEmail(userRequest.email());
        user.setGender(userRequest.gender());
        user.setMarriedStatus(userRequest.marriedStatus());
        user.setCard(mapCardRequestToCard(userRequest.card()));
        user.setAddress(mapAddressRequestToAddress(userRequest.address()));
        return user;
    }

    private static Address mapAddressRequestToAddress(UserRequest.AddressRequest addressRequest) {
        Address address = new Address();
        address.setCity(addressRequest.city());
        address.setState(addressRequest.state());
        address.setCountry(addressRequest.country());
        address.setCountryCode(addressRequest.countryCode());

        return address;
    }

    private static Card mapCardRequestToCard(UserRequest.CardRequest cardRequest) {
        Card card = new Card();
        card.setBalance(cardRequest.balance());
        card.setCardType(cardRequest.cardType());
        card.setCardNumber(cardRequest.cardNumber());
        card.setCurrencyCode(cardRequest.currencyCode());
        return card;
    }

}
