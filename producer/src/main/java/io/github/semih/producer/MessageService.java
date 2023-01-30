package io.github.semih.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageService {

    @Value("${event.kafka.topic.name}")
    private String topicName;

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public void produce(Message message) {
        kafkaTemplate.send(topicName, message);
    }

}
