package com.goodeveloper.datapractice.repository;

import com.goodeveloper.datapractice.entity.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BatchRepository {

    private final JdbcTemplate jdbcTemplate;

    @Transactional
    public void saveAll(List<Board> boardList){
        String sql = "INSERT INTO board (id, title, contents, create_at, update_at)"+
            "VALUES (?, ?, ?, ?, ?)";

        jdbcTemplate.batchUpdate(
            sql,
            boardList,
            boardList.size(),
            (PreparedStatement ps, Board board) -> {
                ps.setString(1, board.getId());
                ps.setString(2, board.getTitle());
                ps.setString(3, board.getContents());
                ps.setObject(4, board.getCreateAt());
                ps.setObject(5, board.getUpdateAt());
            });
    }
}