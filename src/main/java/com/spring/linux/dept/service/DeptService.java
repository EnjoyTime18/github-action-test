package com.spring.linux.dept.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.linux.dept.entity.Dept;
import com.spring.linux.dept.repository.DeptRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeptService {
	
	private final DeptRepository deptRepository;

	public List<Dept> getAllDepts() {
		return deptRepository.findAll();
	}
	
	
}
