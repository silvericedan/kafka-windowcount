package com.example.windowcount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SimpleInvoice {
    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;
    @JsonProperty("CreatedTime")
    private Long createdTime;
    @JsonProperty("InvoiceNumber")
    private String storeID;
    @JsonProperty("TotalAmount")
    private Double totalAmount;
}
