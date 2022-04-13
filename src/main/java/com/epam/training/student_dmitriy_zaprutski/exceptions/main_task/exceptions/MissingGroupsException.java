package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions;

public class MissingGroupsException extends RuntimeException {
    public MissingGroupsException() {
        super();
    }

    public MissingGroupsException(String message) {
        super(message);
    }

    public MissingGroupsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingGroupsException(Throwable cause) {
        super(cause);
    }
}
