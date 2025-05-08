package com.example.SpringJWT.repository;

import com.example.SpringJWT.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

  UserEntity findByUsername(String username);

  Boolean existsByUsername(String username);

}
