package com.forumhub.repository;

import com.forumhub.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
    Optional<Course> findByName(String name);
    
    List<Course> findByIsActiveTrue();
    
    List<Course> findByCategory(String category);
    
    boolean existsByName(String name);
}