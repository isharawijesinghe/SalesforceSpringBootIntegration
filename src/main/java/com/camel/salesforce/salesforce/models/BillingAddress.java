package com.camel.salesforce.salesforce.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class BillingAddress {

    private String city;
    private String country;
    private String geocodeAccuracy;
    private String latitude;
    private String longitude;
    private String postalCode;
    private String state;
    private String street;
}
