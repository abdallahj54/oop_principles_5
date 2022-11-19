package java_memory_management;

import class_object.Car;

public class UnderstandingStackAndHeap { //Objects and their instances only go to Heap, everything else goes to stack
    public static void main(String[] args) {

        int age = 45; // goes to stack
        System.out.println(age); //comes from stack

        Car car1 = new Car(); //goes to heap
        car1.make = "Tesla"; //goes to heap
        System.out.println(car1); //comes from stack but connected to heap
    }
}
