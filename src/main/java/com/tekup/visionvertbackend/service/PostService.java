package com.tekup.visionvertbackend.service;



import com.tekup.visionvertbackend.entities.Post;
import com.tekup.visionvertbackend.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post insertPost(Post post){
        if(post.getSujet().isEmpty()){
            return null;
        }
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @Override
    public Post updatePost(Post post){
        if(postRepository.findById(post.getId()).isPresent()){
            Post postToUpdate = postRepository.findById(post.getId()).get();
            postToUpdate.setCommentaires(post.getCommentaires());
            postToUpdate.setDescription(post.getDescription());
            postToUpdate.setNbrlike(post.getNbrlike());
            postToUpdate.setNbrdislike(post.getNbrdislike());
            postToUpdate.setSujet(post.getSujet());
            postToUpdate.setTags(post.getTags());
            postToUpdate.setUser(post.getUser());
            return postRepository.save(postToUpdate);
        }else
            return null;
    }

    @Override
    public void deleteById(Long id){
        postRepository.deleteById(id);
    }

    @Override
    public Post getById(Long id){
        return postRepository.findById(id).get();
    }


}
