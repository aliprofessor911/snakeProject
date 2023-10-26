package com.gamecodeschool.c17snake;

public class Monkey {

    private int age;
    private int name;
    
    public Monkey(int age, int name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("I am a monkey");
    }



}
