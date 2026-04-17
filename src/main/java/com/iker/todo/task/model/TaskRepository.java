package com.iker.todo.task.model;

import com.iker.todo.category.model.Category;
import com.iker.todo.user.model.User;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByAuthor(User user, Sort sort);
    List<Task> findByCategory(Category category);

}
