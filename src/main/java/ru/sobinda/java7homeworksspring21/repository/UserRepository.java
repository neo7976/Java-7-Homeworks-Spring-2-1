package ru.sobinda.java7homeworksspring21.repository;

import org.springframework.stereotype.Repository;
import ru.sobinda.java7homeworksspring21.model.Authorities;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        //todo заглушка, реализовать репозиторий
        return Collections.emptyList();
    }
}
