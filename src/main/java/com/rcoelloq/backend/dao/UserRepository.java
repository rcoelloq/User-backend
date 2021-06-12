package com.rcoelloq.backend.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rcoelloq.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
