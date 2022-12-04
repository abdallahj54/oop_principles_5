package oop_principles.polymorphism;

public class Cat extends Animal{
    public void meow(){
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void eat(String food) {
        System.out.println("Cat eats " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
