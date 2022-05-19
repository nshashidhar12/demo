package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/addusers")
	public List<User> addusers(@RequestBody List<User> users){
		return service.saveUsers(users);
	}
	@GetMapping("/getusers")
	public List<User> getAllusers(){
		return service.findallUsers();
	}
	@GetMapping("/{field}")
	public List<User> getUsersInDesc(@PathVariable String field){
		return service.findAllByDesc(field);
	}
}
