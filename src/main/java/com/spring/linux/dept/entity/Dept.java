package com.spring.linux.dept.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Dept {
	
	@Id
	private int deptno;
	
	private String dname;
	
	private String loc;
}
