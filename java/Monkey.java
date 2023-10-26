package com.gamecodeschool.c17snake;

public class Monkey {

    private int age;
    private int name;
    private int height;
    
    public Monkey(int age, int name) {
        this.age = age;
        this.name = name;
        this.height = 5;
    }


    public void draw(int age) {
        System.out.println("I am a monkey with size of " + age);
    }



}
