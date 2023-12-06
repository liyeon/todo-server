package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//entity 해당 클래스가 jpa enitity 임을 나타냄
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TodoModel {
    // id = 기본키
    //자동증가 generationType.identity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // null 이어도 됨
    @Column(nullable = false)
    private String title;
    @Column(name = "todoOrder", nullable = false)
    private Long order;
    // project 테스크 완료 여부를 알려주는 변수
    @Column(nullable = false)
    private Boolean completed;
}