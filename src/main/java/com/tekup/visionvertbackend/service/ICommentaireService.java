package com.tekup.visionvertbackend.service;

import com.tekup.visionvertbackend.entities.Commentaire;

import java.util.List;

public interface ICommentaireService {

    Commentaire insertCommentaire(Commentaire post);

    List<Commentaire> getAllCommentaires();

    Commentaire updateCommentaire(Commentaire post);

    void deleteById(Long id);

    Commentaire getById(Long id);
}
