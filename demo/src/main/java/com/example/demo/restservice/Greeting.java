package com.example.demo.restservice;

public class Greeting {
    private int id;
    private String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
