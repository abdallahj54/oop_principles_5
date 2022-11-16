package oopPractice;

public class SwordTest {
    public static void main(String[] args) {
        System.out.println("Sword1 is created after this line:");
        Sword sword1 = new Sword("Iron");
        System.out.println("Printing out sword1: " + sword1);

        System.out.println("\nSword2 is created after this line:");
        Sword sword2 = new Sword(3.5, 15.0, "Long Sword", "Iron");
        System.out.println("Print out sword2: " + sword2);

        System.out.println("\nSword3 is created after this line:");
        Sword sword3 = new Sword(10.0, 25.0, "Super Long Sword", "Titanium");
        System.out.println("Print out sword2: " + sword2);


        System.out.println("\nWorking with Static Values:");
        System.out.println("hasHandle = " + Sword.hasHandle); // true (default and final value CANNOT BE CHANGED)
        System.out.println("isSharp before re-assigning = " + Sword.isSharp); // false (default value)
        Sword.damage();
        Sword.isSharp = true; // re-assigning to true
        System.out.println("isSharp after re-assigning = " + Sword.isSharp); // true (re-assigned value)
        Sword.damage();

        Sword.slash(); // Sword is slashing

        System.out.println("\nWorking with non-static methods:");
        sword1.harms(); // 0.0 points
        sword2.harms(); // 52.5 points
        sword3.harms(); // 270.0 points
    }
}
