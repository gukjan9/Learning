package com.prac.kafkaprac1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        this.kafkaProducer.sendMessage(message);

        return "success";
    }
}
