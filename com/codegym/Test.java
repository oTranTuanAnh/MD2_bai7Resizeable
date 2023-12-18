package com.codegym;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 3, "red", true);
        System.out.println("Dien tich ban dau: "+ rec.getArea());

        System.out.println("Dien tich sau khi resize: "+ rec.resize(5));
    }
}
