package com.camel.salesforce.salesforce.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Account {

    private AccountAttributes attributes;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Industry")
    private String industry;
    @JsonProperty("BillingAddress")
    private BillingAddress billingAddress;
    @JsonProperty("LastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("LastModifiedById")
    private String lastModifiedById;
}
