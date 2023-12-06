package org.example.service.repository;

import org.example.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {// 데이터베이스 테이블과 연결될 객체, id 키값 타입
}