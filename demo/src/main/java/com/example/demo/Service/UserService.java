package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	public List<User> saveUsers(List<User> users){
		return userrepository.saveAll(users);
	}
	
	public List<User> findallUsers(){
		return userrepository.findAll();
	}
	
	public List<User> findAllByDesc(String field){
		return userrepository.findAll(Sort.by(Sort.Direction.DESC,field));
	}

}
