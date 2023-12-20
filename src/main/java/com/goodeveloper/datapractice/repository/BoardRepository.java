package com.goodeveloper.datapractice.repository;

import com.goodeveloper.datapractice.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, String> {
}
