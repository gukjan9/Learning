package com.practice.websocketprac.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@RequiredArgsConstructor
@Component
public class WebSocketHandler extends TextWebSocketHandler {

    private final ChatService chatService;
    private final ObjectMapper objectMapper;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        log.info("payload : {}", payload);

//        TextMessage initialGreeting = new TextMessage("Welcome to chat server");
//        session.sendMessage(initialGreeting);

        ChatMessage chat = objectMapper.readValue(payload, ChatMessage.class);
        ChatRoom room = chatService.findById(chat.getRoomId());
        room.handleActions(session, chat, chatService);
    }
}