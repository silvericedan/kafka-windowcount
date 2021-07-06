package com.example.windowcount.bindings;

import com.example.windowcount.model.SimpleInvoice;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

public interface InvoiceListenerBinding {

    @Input("invoice-input-channel")
    KStream<String, SimpleInvoice> invoiceInputStream();

}
