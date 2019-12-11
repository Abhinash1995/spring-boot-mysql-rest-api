package com.Abhinash.springbootmysqlrestapi.repository;

import com.Abhinash.springbootmysqlrestapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepos extends JpaRepository<Student, Long> {
}
