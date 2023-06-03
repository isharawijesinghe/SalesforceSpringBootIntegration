package com.camel.salesforce.salesforce.routs;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SalesforceIntegrationRoute extends RouteBuilder {

        @Override
        public void configure() throws Exception {
            rest("/processData")
                    .get()
                    .to("direct:processData");

            from("direct:processData")
                    .log("Salesforce camel started")
                    .to("salesforce:query?sObjectQuery=SELECT name, industry FROM Account")
                    .log("Received Salesforce response: ${body}");
    }
}
