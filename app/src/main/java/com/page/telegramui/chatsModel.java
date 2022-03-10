package com.page.telegramui;

public class chatsModel {
    String name1,chat,time;

    public chatsModel(String name1, String chat, String time, int profile) {
        this.name1 = name1;
        this.chat = chat;
        this.time = time;
        this.profile = profile;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    int profile;
}
