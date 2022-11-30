package ru.sobinda.java7homeworksspring21.service;

import org.springframework.stereotype.Service;
import ru.sobinda.java7homeworksspring21.model.Authorities;
import ru.sobinda.java7homeworksspring21.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        return Collections.EMPTY_LIST;
    }
}
