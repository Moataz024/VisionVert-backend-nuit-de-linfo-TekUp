package com.tekup.visionvertbackend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;
    private String description;
    @OneToMany
    private List<Tag> tags;
    private int nbrlike;
    private int nbrdislike;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "post")
    private List<Commentaire> commentaires;
}
