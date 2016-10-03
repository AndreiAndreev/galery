package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProxyUserRepository extends JpaRepository<User, Integer> {
    User save(User user);

    User findOne(Integer integer);

    User getByEmail(String email);
}
