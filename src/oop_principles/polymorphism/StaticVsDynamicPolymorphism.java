package oop_principles.polymorphism;

public class StaticVsDynamicPolymorphism {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat(); //static polymorphism

        Animal dog = new Dog(); //up-casted Dog object
        dog.sleep(); //dynamic polymorphism
    }
}
