package com.ivan.chernyak;

import com.ivan.chernyak.hobbies.hobbyExceptions.HobbyExceptions;

/**
 * This class creates objects - a person's hobby.
 */
public abstract class Hobby {
    /**
     * This field is responsible for the name of the person.
     */
    private String name;

    /**
     * This field is responsible for the number of hours spent for the hobby.
     */
    private int hours;

    /**
     * Creates an object with the specified name and number of hours.
     *
     * @param userName  name.
     * @param userHours hours.
     */
    public Hobby(final String userName, final int userHours) {
        this.name = userName;
        this.hours = userHours;
    }

    /**
     * Creates an object with the specified name.
     *  @param userName  name.
     */
    public Hobby(final String userName) {
        this.name = userName;
    }

    /**
     * Creates an object with the specified number of hours.
     * @param userHours hours.
     */
    public Hobby(final int userHours) {
        this.hours = userHours;
    }

    /**
     * This method returns the name of the person.
     * @return name.
     */
    protected final String getName() {
        return name;
    }

    /**
     * This method returns number of hours spent for the hobby.
     * @return hours.
     */
    protected final int getHours() {
        return hours;
    }

    /**
     * This method sets the name of the person.
     *
     * @param userName name.
     */
    public final void setName(final String userName) {
        this.name = userName;
    }

    /**
     * This method sets number of hours spent for the hobby.
     *
     * @param userHours hours.
     */
    public final void setHours(final int userHours) {
        this.hours = userHours;
    }

    /**
     * This is an abstract method for displaying information about an object.
     * @return specified String with info about object.
     */
    public abstract String tellAboutHobby();

    /**
     * This is a helper method for testExceptionMethod().
     * This is an method for displaying information about an object.
     *
     * @return specified String with info about object.
     * @throws HobbyExceptions an exception that can occur
     *                         if the field name is equals "Ivan"
     */
    private String anotherTellAboutHobby() throws HobbyExceptions {
        if (name.equals("Ivan")) {
            throw new HobbyExceptions("Uncorrected name = " + name);
        }
        return "Hello, " + name + "! This is another method for second commit!";
    }

    /**
     * This method calls the exception-method and processes it.
     */
    public final void testExceptionMethod() {
        try {
            this.anotherTellAboutHobby();
        } catch (HobbyExceptions hobbyExceptions) {
            System.out.println("Hello, userName! This is catch-block");
        } finally {
            System.out.println("This is finally block!");
        }
    }
}
