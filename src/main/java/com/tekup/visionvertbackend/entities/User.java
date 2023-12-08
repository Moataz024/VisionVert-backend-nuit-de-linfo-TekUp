package com.tekup.visionvertbackend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    private Boolean sexe;
    private String password;
    @OneToMany
    private List<Role> roles;
    private int coin;
    @OneToMany
    private List<Post> posts;

}
