package com.TechnoSignia.CrudPractice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.CrudPractice.Entity.User;
import com.TechnoSignia.CrudPractice.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public User addUser(User user) {
		return repo.save(user);
	}
	
	public List<User> readUser() {
		return repo.findAll();
	}

	public User perticularUser(Long id) {
		return repo.findById(id).orElse(null);
				
	}

	public User updateUser(Long id,User userDetail) {
		userDetail.setId(id);
		return repo.save(userDetail);
	}
	public String deletedata(Long id) {
		repo.deleteById(id);
		return "User deleted succesfully..!";
	}


	
}
