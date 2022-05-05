package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setHeight(20.5);
        rec.setWidth(10.8);

        System.out.println("The area: " + rec.area());
    }
}
