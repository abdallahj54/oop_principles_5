package oop_principles.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {

        Object[] objects = {1, 2, 4.5, 10.33, 'X', "Alex", "John", new Scanner(System.in), new ArrayList<>(), new Dog(), new Cat()};

        double d = (Double)objects[2] + 5;
        System.out.println(d); //9.5

        Dog dog = (Dog) objects[9];
        dog.bark(); //Dog barks

        ArrayList<String> names = (ArrayList<String>) objects[8];
        System.out.println(names.size()); //0
    }
}
