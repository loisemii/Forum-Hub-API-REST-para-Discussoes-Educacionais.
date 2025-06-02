package com.forumhub.repository;

import com.forumhub.model.Topic;
import com.forumhub.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    
    Page<Topic> findByIsActiveTrueOrderByCreatedAtDesc(Pageable pageable);
    
    List<Topic> findByAuthorAndIsActiveTrue(User author);
    
    List<Topic> findByCourseIdAndIsActiveTrue(Long courseId);
    
    @Query("SELECT t FROM Topic t WHERE t.isActive = true AND " +
           "(LOWER(t.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(t.message) LIKE LOWER(CONCAT('%', :keyword, '%')))")
    Page<Topic> findByKeyword(@Param("keyword") String keyword, Pageable pageable);
    
    Optional<Topic> findByIdAndIsActiveTrue(Long id);
}