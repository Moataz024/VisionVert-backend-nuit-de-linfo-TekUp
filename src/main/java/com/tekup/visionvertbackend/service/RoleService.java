package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.Role;
import com.tekup.visionvertbackend.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    @Autowired
    RoleRepository postRepository;

    @Override
    public Role insertRole(Role post){
        return postRepository.save(post);
    }

    @Override
    public List<Role> getAllRoles(){
        return postRepository.findAll();
    }

    @Override
    public Role updateRole(Role post){
        if(postRepository.findById(post.getId()).isPresent()){
            Role postToUpdate = postRepository.findById(post.getId()).get();
            postToUpdate.setRole(post.getRole());
            return postRepository.save(postToUpdate);
        }else
            return null;
    }

    @Override
    public void deleteById(Long id){
        postRepository.deleteById(id);
    }

    @Override
    public Role getById(Long id){
        return postRepository.findById(id).get();
    }


}
