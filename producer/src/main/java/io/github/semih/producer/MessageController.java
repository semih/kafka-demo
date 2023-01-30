package io.github.semih.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/kafka")
    public void send(@RequestBody Message message) {
        messageService.produce(message);
    }

}
