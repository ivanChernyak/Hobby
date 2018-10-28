package com.ivan.chernyak.hobbys;

import com.ivan.chernyak.Hobby;

public class Reading extends Hobby {
    private String favoriteBook;

    public Reading(String name, int hours, String favoriteBook) {
        super(name, hours);
        this.favoriteBook = favoriteBook;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    @Override
    public String tellAboutHobby() {
        return "name - " + getName() + " hours - " + getHours() + " favoriteBook - " + getFavoriteBook();
    }
}
