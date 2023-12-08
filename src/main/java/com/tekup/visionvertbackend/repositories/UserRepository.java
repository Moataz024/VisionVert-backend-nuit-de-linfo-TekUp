package com.tekup.visionvertbackend.repositories;
import com.tekup.visionvertbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}