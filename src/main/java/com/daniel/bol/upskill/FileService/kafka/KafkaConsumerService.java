package com.daniel.bol.upskill.FileService.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.daniel.bol.upskill.FileService.FileServiceController;

@Service
public class KafkaConsumerService {

    private final static String TOPIC = "BolUpskill-topic";
    private final static String DUMP_SAVED_MESSAGE = "Queries saved";
    
    @Autowired
    private FileServiceController fileServiceController;


    @KafkaListener(groupId = "bolupskill-group", topics = TOPIC)
    public void consume(ConsumerRecord<String, String> consumerRecord) {
        System.out.println("Message received:"+consumerRecord.value());
        if (consumerRecord.value() != null && DUMP_SAVED_MESSAGE.equals(consumerRecord.value())) {
            fileServiceController.saveDump();
        }
    }

}
