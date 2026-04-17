package com.iker.todo.task.exception;

import jakarta.persistence.EntityNotFoundException;

public class TaskNotFoundException extends EntityNotFoundException {
    public TaskNotFoundException(String message) {
        super(message);
    }

    public TaskNotFoundException(long id) {
        super("Task with ID: %d not found".formatted(id));
    }
}
