package com.goodeveloper.datapractice.repository;

import com.goodeveloper.datapractice.entity.Board;
import com.goodeveloper.datapractice.entity.BoardLong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardLongRepository extends JpaRepository<BoardLong, Long> {
}
