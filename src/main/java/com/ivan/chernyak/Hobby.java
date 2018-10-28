package com.ivan.chernyak;

public class Hobby {
    private String name;
    private int hours;

    public Hobby(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String tellAboutHobby() {
        return "Name - " + name + "; Hours - " + hours;
    }
    
    public String anotherTellAboutHobby(){
        return "This is another method for second commit!";
    }
}
