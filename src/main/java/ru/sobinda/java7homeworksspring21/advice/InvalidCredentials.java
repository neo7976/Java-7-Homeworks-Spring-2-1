package ru.sobinda.java7homeworksspring21.advice;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}
