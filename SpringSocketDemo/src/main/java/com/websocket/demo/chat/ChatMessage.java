package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private static int onlineCount = 0;
    private int currentOnlineCount;

    public static void increase(){
        onlineCount++;
    }
    public static void decrease(){
        onlineCount--;
    }

    public static int getCount(){
        return onlineCount;
    }

    public void setCount(){
        currentOnlineCount = onlineCount;
    }
}
