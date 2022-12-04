package oop_principles.polymorphism;

public class Animal {

    //eat, eat(String), sleep
    public void eat(){
        System.out.println("Animal eats");
    }

    public void eat(String food){
        System.out.println("Animal eats " + food);
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }
}
