package com.luv2code.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/ai")
public class AiController {
	
	private final ChatClient chatClient;

	@GetMapping("")
	public ChatResponse chatOpenAi(@RequestParam(value = "message", defaultValue = "Tell a joke") String message){
		
		ChatResponse chatResponse = chatClient.prompt()
				.user(message)
				.call()
				.chatResponse();
		
		return chatResponse;
	}
	
}
