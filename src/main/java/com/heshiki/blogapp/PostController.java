package com.heshiki.blogapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
@AllArgsConstructor
public class PostController {
    private final PostRepository postRepository;

    @GetMapping("/postForm")
    public String showPostForm(@ModelAttribute("postForm") PostForm form){
        return "postForm";
    }

    @PostMapping("/posts")
    public String createPost(PostForm postForm){
        LocalDateTime now = LocalDateTime.now();
        postRepository.insert(postForm.getTitle(), postForm.getContent(), now, now);
        return "redirect:/";
    }


}
