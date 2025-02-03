package com.webenius.chatappspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deepseek")
public class DeepSeekController {

    /*@Bean
    CommanLineRunner run(ChatClient.Builder builder) {
        return args -> {
            var client = builder.build();

            String response = client.prompt()
                    .user("What is DeepSeek?")
                    .call()
                    .content();
            System.out.println("DeepSeek response: " + response);
        };
    }*/
}
