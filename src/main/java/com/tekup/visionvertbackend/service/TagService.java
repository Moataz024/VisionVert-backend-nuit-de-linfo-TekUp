package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.Tag;
import com.tekup.visionvertbackend.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements ITagService{

    @Autowired
    TagRepository postRepository;

    @Override
    public Tag insertTag(Tag post){
        return postRepository.save(post);
    }

    @Override
    public List<Tag> getAllTags(){
        return postRepository.findAll();
    }

    @Override
    public Tag updateTag(Tag post){
        if(postRepository.findById(post.getId()).isPresent()){
            Tag postToUpdate = postRepository.findById(post.getId()).get();
            postToUpdate.setTags(post.getTags());
            return postRepository.save(postToUpdate);
        }else
            return null;
    }

    @Override
    public void deleteById(Long id){
        postRepository.deleteById(id);
    }

    @Override
    public Tag getById(Long id){
        return postRepository.findById(id).get();
    }


}
