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

    public void draw(int age) {
        System.out.println("I am a monkey with size of " + age);
    }



}
