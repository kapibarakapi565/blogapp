package com.heshiki.blogapp;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostForm {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
