package com.example.springstudyinha.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(builderClassName = "UserBuilder")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardId;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private String writer;
    @Column
    private String date;
    @Column
    private int view_time;
    @Column
    private int recommend_time;
    @Column
    private int comment_num;
}
