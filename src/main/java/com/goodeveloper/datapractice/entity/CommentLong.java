package com.goodeveloper.datapractice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class CommentLong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String contents;
    @Column
    private LocalDateTime createAt;
    @Column
    private LocalDateTime updateAt;
    @ManyToOne
    private Board board;
}
