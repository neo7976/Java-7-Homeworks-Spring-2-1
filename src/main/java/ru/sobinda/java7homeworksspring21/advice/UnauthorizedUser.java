package ru.sobinda.java7homeworksspring21.advice;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String message) {
        super(message);
    }
}
