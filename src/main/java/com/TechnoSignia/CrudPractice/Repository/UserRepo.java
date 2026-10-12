package com.TechnoSignia.CrudPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechnoSignia.CrudPractice.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
