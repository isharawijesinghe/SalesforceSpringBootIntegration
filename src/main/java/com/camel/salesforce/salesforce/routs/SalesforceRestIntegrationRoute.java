package com.camel.salesforce.salesforce.routs;

import com.camel.salesforce.salesforce.common.JsonConverter;
import com.camel.salesforce.salesforce.models.AccountListResponse;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class SalesforceRestIntegrationRoute extends RouteBuilder {


        @Override
        public void configure() throws Exception {
            rest("/processData")
                    .get()
                    .to("direct:processData");

            from("direct:processData")
                    .log("Salesforce camel started")
                    .to("salesforce:query?sObjectQuery=SELECT name, industry, BillingAddress, " +
                            " LastModifiedDate , LastModifiedById FROM Account")
                    .unmarshal().json(JsonLibrary.Jackson, AccountListResponse.class)
                    .process(exchange -> {
                        AccountListResponse accountResponse = exchange.getIn().getBody(AccountListResponse.class);
                        String json = JsonConverter.toJson(accountResponse);
                        // Set the response as the outgoing message body
                        exchange.getMessage().setBody(json);
                    }).log("Received Salesforce response: ${body}");
    }
}
