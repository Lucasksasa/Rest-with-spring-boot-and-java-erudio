package com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;

public class Greeting {
    private final Long id;
    private final String content;


    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }
}
