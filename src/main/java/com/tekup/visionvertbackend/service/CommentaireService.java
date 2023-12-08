package com.tekup.visionvertbackend.service;



import com.tekup.visionvertbackend.entities.Commentaire;
import com.tekup.visionvertbackend.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireService implements ICommentaireService{

    @Autowired
    CommentaireRepository commentaireRepository;

    @Override
    public Commentaire insertCommentaire(Commentaire commentaire){
        return commentaireRepository.save(commentaire);
    }

    @Override
    public List<Commentaire> getAllCommentaires(){
        return commentaireRepository.findAll();
    }

    @Override
    public Commentaire updateCommentaire(Commentaire commentaire){
        if(commentaireRepository.findById(commentaire.getId()).isPresent()){
            Commentaire commentaireToUpdate = commentaireRepository.findById(commentaire.getId()).get();
            commentaireToUpdate.setPost(commentaire.getPost());
            commentaireToUpdate.setDescription(commentaire.getDescription());
            commentaireToUpdate.setNbrlike(commentaire.getNbrlike());
            commentaireToUpdate.setNbrdislike(commentaire.getNbrdislike());
            return commentaireRepository.save(commentaireToUpdate);
        }else
            return null;
    }

    @Override
    public void deleteById(Long id){
        commentaireRepository.deleteById(id);
    }

    @Override
    public Commentaire getById(Long id){
        return commentaireRepository.findById(id).get();
    }


}
