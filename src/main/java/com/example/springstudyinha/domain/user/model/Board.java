package com.example.springstudyinha.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(builderMethodName = "BoardBuilder")
public class Board extends BaseTIme{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardName;
    @Column
    private String boardExplain;

}
