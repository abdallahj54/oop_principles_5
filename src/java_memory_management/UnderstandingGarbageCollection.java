package java_memory_management;

import class_object.Animal;

public class UnderstandingGarbageCollection {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cow", 5);
        Animal a2 = new Animal("Dog", 3);
        Animal a3 = new Animal("Cat", 1);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n--------------------------\n");

        a1 = a2; //Reassigning a1 to be the same as a2 and moves the initial a1 info in heap to the garbage
        a3 = null; //Reassigning a3 to be null (breaking the connection from stack to heap and moves the heap info to the garbage)

        //Explicitly invoking the Garbage Collection
        System.gc(); //Printing what was moved to the Garbage Collection with the statement from the Object's Class
        //Runtime.getRuntime().gc(); ANOTHER VERSION OF System.gc()

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
