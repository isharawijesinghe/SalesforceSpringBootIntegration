package com.camel.salesforce.salesforce.routs;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SalesforceTopicIntegrationRoute extends RouteBuilder {

        @Override
        public void configure() throws Exception {
            from("salesforce:subscribe:/topic/Account")
                    .log("${body}");

    }
}
