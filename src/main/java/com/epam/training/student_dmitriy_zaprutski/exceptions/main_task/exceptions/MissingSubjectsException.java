package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions;

public class MissingSubjectsException extends RuntimeException {
    public MissingSubjectsException() {
        super();
    }

    public MissingSubjectsException(String message) {
        super(message);
    }

    public MissingSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingSubjectsException(Throwable cause) {
        super(cause);
    }
}
