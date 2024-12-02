package com.daniel.bol.upskill.FileService.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final static String TOPIC = "BolUpskill-topic";

    @KafkaListener(groupId = "bolupskill-group", topics = TOPIC)
    public void consume(ConsumerRecord<String, String> consumerRecord) {
        System.out.println("Message received:"+consumerRecord.value());

    }

}
