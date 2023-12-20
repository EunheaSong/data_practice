package com.goodeveloper.datapractice.repository;

import com.goodeveloper.datapractice.entity.Comment;
import com.goodeveloper.datapractice.entity.CommentLong;
import org.springframework.data.jpa.repository.JpaRepository;

interface CommentLongRepository extends JpaRepository<CommentLong, Long> {
}
