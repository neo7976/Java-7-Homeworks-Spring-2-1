package ru.sobinda.java7homeworksspring21.service;

import org.springframework.stereotype.Service;
import ru.sobinda.java7homeworksspring21.exceptions.InvalidCredentials;
import ru.sobinda.java7homeworksspring21.exceptions.UnauthorizedUser;
import ru.sobinda.java7homeworksspring21.model.Authorities;
import ru.sobinda.java7homeworksspring21.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}