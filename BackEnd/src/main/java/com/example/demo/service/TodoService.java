package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> getAllTodos(String username){
		return todoRepository.findAllTodos(username);
	}
	
	public Todo addTodo(Todo todo) {
		return todoRepository.save(todo);
	}
	
	public void removeTodo(Integer id) {
		todoRepository.deleteById(id);
	}
	
	public Todo modifyTodo(Todo todo) {
		return todoRepository.save(todo);
	}
}
