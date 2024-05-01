package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();

	}

	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	};

	public User insert(User user) {
		return userRepository.save(user);
	};

	public void delete(Long id) {
		userRepository.findById(id).ifPresent(user -> userRepository.delete(user));
	};

	public User update(Long id, User user) {
		User updateUser = userRepository.findById(id).orElse(null);
		if (updateUser != null) {
			user.setId(id);
			return userRepository.save(user);
		}
		return null;
	}
}