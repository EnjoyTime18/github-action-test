package com.spring.linux.dept.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.linux.dept.entity.Dept;
import com.spring.linux.dept.service.DeptService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DeptController {
	
	private final DeptService deptService;
	
	@GetMapping("/api/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/api/depts")
	public List<Dept> getAllDepts() {
		return deptService.getAllDepts();
	}
	
	
	
}
