package io.github.semih.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {
    @KafkaListener(
            topics =  "${event.kafka.topic.name}",
            groupId = "${event.kafka.group}"
    )
    public Message consume(@Payload Message message) {
        log.info(message.message());
        return message;
    }
}
