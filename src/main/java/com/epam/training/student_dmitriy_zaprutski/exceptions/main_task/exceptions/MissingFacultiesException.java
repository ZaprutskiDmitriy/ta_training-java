package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions;

public class MissingFacultiesException extends RuntimeException {
    public MissingFacultiesException() {
        super();
    }

    public MissingFacultiesException(String message) {
        super(message);
    }

    public MissingFacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingFacultiesException(Throwable cause) {
        super(cause);
    }
}
