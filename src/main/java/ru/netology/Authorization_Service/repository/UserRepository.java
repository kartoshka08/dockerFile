package ru.netology.Authorization_Service.repository;

import ru.netology.Authorization_Service.model.Authorities;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository implements UserRepositoryInterface {

    @Override
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("Kira") && password.equals("811")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return authorities;
    }
}