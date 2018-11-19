package com.ivan.chernyak.hobbies;

import com.ivan.chernyak.Hobby;

/**
 * This class creates objects - reading-hobby.
 */
public class Reading extends Hobby {
    /**
     * This field is responsible for the person's favorite book.
     */
    private String favoriteBook;

    /**
     * Creates an object with the specified name,
     * number of hours and favorite book.
     *
     * @param name         name.
     * @param hours        hours.
     * @param userFavoriteBook favorite book.
     */
    public Reading(final String name,
                   final int hours,
                   final String userFavoriteBook) {
        super(name, hours);
        this.favoriteBook = userFavoriteBook;
    }

    /**
     * This method returns favorite book.
     *
     * @return favorite book.
     */
    public final String getFavoriteBook() {
        return favoriteBook;
    }

    /**
     * This method sets favorite book.
     *
     * @param userFavoriteBook favorite book.
     */
    public final void setFavoriteBook(final String userFavoriteBook) {
        this.favoriteBook = userFavoriteBook;
    }

    /**
     * This is a method for displaying information about an object.
     *
     * @return specified String with info about object.
     */
    @Override
    public final String tellAboutHobby() {
        return "name - " + getName() + " hours - " + getHours()
                + " favoriteBook - "
                + getFavoriteBook();
    }
}
