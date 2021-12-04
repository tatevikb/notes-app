package org.learning.notes.infrastructure.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.learning.notes.infrastructure.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
