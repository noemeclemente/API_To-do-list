package com.example.desafiotodolist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.desafiotodolist.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
}

