package com.goodeveloper.datapractice.repository;

import com.goodeveloper.datapractice.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

interface CommentRepository extends JpaRepository<Comment, String> {
}
