package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.Post;

import java.util.List;

public interface IPostService {

    Post insertPost(Post post);

    List<Post> getAllPosts();

    Post updatePost(Post post);

    void deleteById(Long id);

    Post getById(Long id);
}
