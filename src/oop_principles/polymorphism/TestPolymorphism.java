package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        System.out.println("Animal: ");
        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        Cat c1 = new Cat();
        System.out.println("\nCat: ");
        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        System.out.println("\nDog: ");
        d1.eat();
        d1.eat("Bones");
        d1.sleep();
        d1.bark();

        /*
        Up-Casting
        parent reference = child object
         */

        System.out.println("\nUp-Casting: "); //Implicitly
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a3.sleep(); //Dog sleeps (Dynamic Polymorphism/Up-Casting)

        System.out.println("\nDown-Casting: "); //Explicitly
        //Cat cat = (Cat) new Animal(); Bad example of down-casting - ClassCastException
        Animal myDog = new Dog(); //Up-Casting
        Dog newDog = (Dog) myDog;
        newDog.bark(); //Dog barks
    }
}
