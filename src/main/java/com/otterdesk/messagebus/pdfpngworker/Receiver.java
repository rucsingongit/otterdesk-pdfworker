package com.otterdesk.messagebus.pdfpngworker;

import com.otterdesk.messagebus.pdfpngworker.model.PdfData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


@Component
public class Receiver {

    Logger log = LoggerFactory.getLogger(Receiver.class);
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        log.info("Message From PDF to PNG Worker - Received Pdf data " + message);
        log.info("Message From PDF to PNG Worker - Handing off Pdf Data to Orientation Worker for further processing " + message);

        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}