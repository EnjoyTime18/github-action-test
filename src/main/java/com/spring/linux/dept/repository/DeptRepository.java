package com.spring.linux.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.linux.dept.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
