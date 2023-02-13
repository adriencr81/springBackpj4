package com.isika.al18.projet4.springBack.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isika.al18.projet4.springBack.modele.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
