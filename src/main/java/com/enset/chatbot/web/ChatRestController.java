package com.enset.chatbot.web;

import com.enset.chatbot.services.ChatAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRestController {
    private ChatAiService chatAiService;

    public ChatRestController(ChatAiService chatAiService) {
        this.chatAiService = chatAiService;
    }

    @GetMapping("/ask")
    public  String asl(String question){
        return  chatAiService.ragChat(question);
    }
}