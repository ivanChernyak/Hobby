package com.ivan.chernyak.hobbys;

import com.ivan.chernyak.Hobby;

public class Main {
    public static void main(String[] args) {
        Hobby[] hobby = {
                new Football("Ivan", 2, "Atlético Madrid"),
                new Reading("Olha", 5, "Fahrenheit 451")};

        for (Hobby h : hobby) {
            System.out.println(h.tellAboutHobby());
        }
    }
}
