package com.example.crud.domain.repository;

import com.example.crud.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BoardRepository extends JpaRepository<Board, Long> {

}
