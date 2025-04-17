package com.example.chatbot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RasaService {

    private static final String RASA_URL = "http://localhost:5005/webhooks/rest/webhook";

    public String getBotResponse(String message) {
        RestTemplate restTemplate = new RestTemplate();
        String requestJson = "{\"sender\":\"user\",\"message\":\"" + message + "\"}";

        String response = restTemplate.postForObject(RASA_URL, requestJson, String.class);

        return response;
    }
}
