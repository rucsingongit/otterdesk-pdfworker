package com.otterdesk.messagebus.pdfpngworker;

import com.otterdesk.messagebus.pdfpngworker.model.PdfData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        PdfData pdfData = new PdfData("5d5f044f-ea3b-4533-9f55-2e1a45b02aab",
                "pdf_to_image",
                "https://s3.us-east-2.amazonaws.com/pdfs/74efe087-7949-46db-8a8d-ee06776eb2b0.pdf",
                1544404634l,
                2);
        rabbitTemplate.convertAndSend(PdfPngWorkerApplication.topicExchangeName, "foo.bar.baz", pdfData.toString());
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }

}