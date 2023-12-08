package com.tekup.visionvertbackend.repositories;

import com.tekup.visionvertbackend.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
