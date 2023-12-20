package com.goodeveloper.datapractice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Comment {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String id = String.valueOf(UUID.randomUUID());

    @Column
    private String contents;
    @Column
    private LocalDateTime createAt;
    @Column
    private LocalDateTime updateAt;
    @ManyToOne
    private Board board;
}
