package com.tekup.visionvertbackend.controller;


import com.tekup.visionvertbackend.entities.Post;
import com.tekup.visionvertbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("/")
    public Post insertPost(@RequestBody Post post){
        return postService.insertPost(post);
    }

    @PutMapping("/update")
    public Post updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        postService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable("id")Long id){
        return postService.getById(id);
    }

}
