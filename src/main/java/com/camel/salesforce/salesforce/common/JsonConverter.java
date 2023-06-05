package com.camel.salesforce.salesforce.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Component;

@Component
public class JsonConverter {

    private static final ObjectWriter ow  =  new ObjectMapper().writer().withDefaultPrettyPrinter();

    public static <T> String toJson(T object) throws JsonProcessingException {
        return ow.writeValueAsString(object);
    }

}
