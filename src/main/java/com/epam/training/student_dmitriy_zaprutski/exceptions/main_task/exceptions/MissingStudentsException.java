package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions;

public class MissingStudentsException extends RuntimeException {
    public MissingStudentsException() {
        super();
    }

    public MissingStudentsException(String message) {
        super(message);
    }

    public MissingStudentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingStudentsException(Throwable cause) {
        super(cause);
    }
}
