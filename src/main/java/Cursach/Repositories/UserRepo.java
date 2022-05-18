package Cursach.Repositories;

import Cursach.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {//связь с БД пользователей
    User findByUsername(String username);
}
