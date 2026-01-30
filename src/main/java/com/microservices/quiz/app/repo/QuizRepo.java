package com.microservices.quiz.app.repo;

import com.microservices.quiz.app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
