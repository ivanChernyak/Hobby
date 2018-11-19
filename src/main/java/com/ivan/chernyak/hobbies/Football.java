package com.ivan.chernyak.hobbies;

import com.ivan.chernyak.Hobby;

/**
 * This class creates objects - football-hobby.
 */
public class Football extends Hobby {
    /**
     * This field is responsible for the person's favorite football club.
     */
    private String favoriteFootballClub;

    /**
     * Creates an object with the specified name, number of hours
     * and favorite football club.
     *
     * @param name                 name.
     * @param hours                hours.
     * @param userFavoriteFootballClub favorite football club.
     */
    public Football(final String name,
                    final int hours,
                    final String userFavoriteFootballClub) {
        super(name, hours);
        this.favoriteFootballClub = userFavoriteFootballClub;
    }

    /**
     * This method returns favorite football club.
     *
     * @return favorite football club.
     */
    public final String getFavoriteFootballClub() {
        return favoriteFootballClub;
    }

    /**
     * This method sets favorite football club.
     *
     * @param userFavFootballClub favorite football club.
     */
    public final void setFavFootballClub(final String userFavFootballClub) {
        this.favoriteFootballClub = userFavFootballClub;
    }

    /**
     * This is a method for displaying information about an object.
     *
     * @return specified String with info about object.
     */
    @Override
    public final String tellAboutHobby() {
        return "name - " + getName() + " hours - " + getHours()
                + " favoriteFootballClub - "
                + getFavoriteFootballClub();
    }
}
