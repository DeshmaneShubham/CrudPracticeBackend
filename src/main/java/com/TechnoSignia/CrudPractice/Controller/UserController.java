package com.TechnoSignia.CrudPractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.CrudPractice.Entity.User;
import com.TechnoSignia.CrudPractice.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	// Save data or add data
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return service.addUser(user);
	}
	@GetMapping("/allData")
	public List<User> allUse(){
		return service.readUser();
	}
	
	@GetMapping("/allData/{id}")
	public User alldata(@PathVariable Long id) {
		return service.perticularUser(id);
	}

	@GetMapping ("/detailbyparem")
	public User allDatabyparem(@RequestParam Long id) {
		return service.perticularUser(id);
	}
	
	@PutMapping("/update/{id}")
	public User update(@PathVariable Long id,@RequestBody User user){
		return service.updateUser(id,user);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUserrec(@PathVariable Long id) {
		return service.deletedata(id);
	}
	
}
