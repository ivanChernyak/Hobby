package com.ivan.chernyak.hobbys;

import com.ivan.chernyak.Hobby;

public class Football extends Hobby {
    private String favoriteFootballClub;

    public Football(String name, int hours, String favoriteFootballClub) {
        super(name, hours);
        this.favoriteFootballClub = favoriteFootballClub;
    }

    public String getFavoriteFootballClub() {
        return favoriteFootballClub;
    }

    public void setFavoriteFootballClub(String favoriteFootballClub) {
        this.favoriteFootballClub = favoriteFootballClub;
    }

    @Override
    public String tellAboutHobby() {
        return "name - " + getName() + " hours - " + getHours() + " favoriteFootballClub - " + getFavoriteFootballClub();
    }
}
