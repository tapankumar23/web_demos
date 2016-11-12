package com.tap.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tap.backend.models.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long>{

	User save(User user);
}
