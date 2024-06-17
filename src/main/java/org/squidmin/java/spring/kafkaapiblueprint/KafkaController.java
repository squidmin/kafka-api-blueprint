package org.squidmin.java.spring.kafkaapiblueprint;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class KafkaController {

    private RestTemplate restTemplate;

    private static final String PRODUCER_URL = "http://kafka-producer-app:8080/publish";

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        String url = PRODUCER_URL + "?message=" + message;
        return restTemplate.postForObject(url, null, String.class);
    }

}
