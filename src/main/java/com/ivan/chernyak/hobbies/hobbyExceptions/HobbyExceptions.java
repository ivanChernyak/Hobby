package com.ivan.chernyak.hobbies.hobbyExceptions;

/**
 * This class creates a custom exception.
 */
public class HobbyExceptions extends Exception {
    /**
     * Empty constructor.
     */
    public HobbyExceptions() {
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message.
     */
    public HobbyExceptions(final String message) {
        super(message);
    }
}
