package com.laptrinhjavaweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.entity.NewEntity;

@RestController
public class HomeController {
	@PostMapping(value = "/home")
	public NewEntity createNew(@RequestBody NewEntity model) {
		return model;
	}
}
