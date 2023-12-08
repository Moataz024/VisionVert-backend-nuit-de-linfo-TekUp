package com.tekup.visionvertbackend.service;



import com.tekup.visionvertbackend.entities.User;
import com.tekup.visionvertbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User insertUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public User updateUser(User user){
        if(userRepository.findById(user.getId()).isPresent()){
            User userToUpdate = userRepository.findById(user.getId()).get();
            userToUpdate.setPosts(user.getPosts());
            userToUpdate.setCoin(user.getCoin());
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setNom(user.getNom());
            userToUpdate.setSexe(user.getSexe());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setRoles(user.getRoles());
            userToUpdate.setDateNaissance(user.getDateNaissance());
            return userRepository.save(userToUpdate);
        }else
            return null;
    }

    @Override
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public User getById(Long id){
        return userRepository.findById(id).get();
    }


}
