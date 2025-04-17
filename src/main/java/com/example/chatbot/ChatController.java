package com.example.chatbot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class ChatController {

    private final RasaService rasaService;

    public ChatController(RasaService rasaService) {
        this.rasaService = rasaService;
    }

    @PostMapping("/chat")
    @CrossOrigin(origins = "*")
    public String chat(@RequestBody ChatRequest request) {
        return rasaService.getBotResponse(request.getMessage());
    }
}
