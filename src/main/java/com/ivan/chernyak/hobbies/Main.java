package com.ivan.chernyak.hobbies;

import com.ivan.chernyak.Hobby;

/**
 * This class is created for the test.
 */
public final class Main {
    /**
     * This field is responsible for number of hours.
     */
    public static final int HOURS = 2;

    /**
     * This method is created for the test.
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        Hobby[] hobby = {
                new Football("Ivan", HOURS, "Atlético Madrid"),
                new Reading("Olha", HOURS, "Fahrenheit 451")};

//        for (Hobby h : hobby) {
//            System.out.println(h.tellAboutHobby());
//        }

        hobby[0].testExceptionMethod();

    }

    /**
     * Private constructor.
     */
    private Main() {
    }
}
