package com.goodeveloper.datapractice.service;

import com.goodeveloper.datapractice.entity.Board;
import com.goodeveloper.datapractice.repository.BatchRepository;
import com.goodeveloper.datapractice.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BulkInsertServiceTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void bulkInsertSaveAll(){
        //given
        List<Board> boardsList = new ArrayList<>();
        int i = 0;
        while (i <= 50) {
            boardsList.add(
              new Board(
                "제목",
                "내용",
                LocalDateTime.now(),
                LocalDateTime.now()
              )
            );
            i++;
        }
        long s = System.currentTimeMillis();
        System.out.println(s);
        //when

        //then
        boardRepository.saveAll(boardsList);
        System.out.println(System.currentTimeMillis() - s);
        Assertions.assertEquals(50, i);
    }
}
