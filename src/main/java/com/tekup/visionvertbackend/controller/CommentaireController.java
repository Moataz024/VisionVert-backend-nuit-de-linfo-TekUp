package com.tekup.visionvertbackend.controller;

import com.tekup.visionvertbackend.entities.Commentaire;
import com.tekup.visionvertbackend.service.ICommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {

    @Autowired
    ICommentaireService postService;

    @GetMapping("/")
    public List<Commentaire> getAllCommentaires(){
        return postService.getAllCommentaires();
    }

    @PostMapping ("/")
    public Commentaire insertCommentaire(@RequestBody Commentaire post){
        return postService.insertCommentaire(post);
    }

    @PutMapping("/update")
    public Commentaire updateCommentaire(@RequestBody Commentaire post){
        return postService.updateCommentaire(post);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        postService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Commentaire getById(@PathVariable("id")Long id){
        return postService.getById(id);
    }

}
