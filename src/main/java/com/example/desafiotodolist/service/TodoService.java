package com.example.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.desafiotodolist.entity.Todo;
import com.example.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list() {
        // Cria uma ordenação por prioridade descendente e nome ascendente
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        
        // Usa o sort no método findAll() e retorna a lista de Todo
        return todoRepository.findAll(sort);
    }
     public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);;
        return list();
    }

    
}
