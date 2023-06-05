package com.camel.salesforce.salesforce.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class AccountListResponse {

    private int totalSize;
    private boolean done;
    private List<Account> records;

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Total Size: ").append(getTotalSize()).append("\n");
//        sb.append("Done: ").append(isDone()).append("\n");
//        sb.append("Records:\n");
//        for (Account account : getRecords()) {
//            sb.append("Name: ").append(account.getName()).append("\n");
//            sb.append("Industry: ").append(account.getIndustry()).append("\n");
//            sb.append("Billing Address: ").append(account.getBillingAddress()).append("\n");
//            sb.append("Last Modified Date: ").append(account.getLastModifiedDate()).append("\n");
//            sb.append("Last Modified By Id: ").append(account.getLastModifiedById()).append("\n");
//            sb.append("=============================================\n");
//        }
//        return sb.toString();
//    }
}
