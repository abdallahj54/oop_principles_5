package java_memory_management;

import class_object.Car;

public class UnderstandingStringPool { //String Pool is in Heap, and it will lump all the Strings inside it. SP saves memory
    public static void main(String[] args) {

        String name1 = "John"; //Goes into String Pool
        String name2 = "Alex"; //Goes into String Pool
        String name3 = "John"; //Reuses name1 string
        String name4 = "John"; //Reuses name1 string
        String name5 = "JOHN"; //Goes into String Pool

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        //Create String as a new object
        String name6 = new String("John"); //Goes to heap like all other objects (OUTSIDE OF STRING POOL)

        //name1, name3, name4 and name6 have the same value of "John"

        System.out.println(name1 == name3); //true because it is looking for them having the same location, and they do
        System.out.println(name1 == name6); //false because they are in different locations
        System.out.println(name1.equals(name6)); //true because it is comparing the actual string values and NOT location

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2); //false because their locations are different
        System.out.println(car1.equals(car2)); //false because
    }
}
