package repository;

import model.User;

public interface UserRepository {
    User save(User user);

    User get(Integer id);

    User getByEmail(String email);
}
