package repository;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataJpaUserRepository implements UserRepository{

    @Autowired
    private ProxyUserRepository proxy;

    public User save(User user) {
        return proxy.save(user);
    }

    public User get(Integer id) {
        return proxy.getOne(id);
    }

    public User getByEmail(String email) {
        return proxy.getByEmail(email);
    }
}
