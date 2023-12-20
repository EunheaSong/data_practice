package com.goodeveloper.datapractice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Board {
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private LocalDateTime createAt;
    @Column
    private LocalDateTime updateAt;
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String id = String.valueOf(UUID.randomUUID());

    public Board(
        String title,
                 String contents,
                 LocalDateTime createAt,
                 LocalDateTime updateAt
    ) {
        this.title = title;
        this.contents = contents;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
}
