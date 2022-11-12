package class_object;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        System.out.println("---Printing the object without toString() in the class level---");
        System.out.println(apple1); //class_object.Apple@1540e19d (Location in the memory)
        System.out.println(apple2); //class_object.Apple@677327b6 (Location in the memory)

        System.out.println("\n---Apple 1---"); //defaults based on public Apple() class level
        System.out.println(apple1.color); // Red
        System.out.println(apple1.taste); // null
        System.out.println(apple1.price); // 0.0

        System.out.println("\n---Apple 2---"); //Re-assigning the defaults from class level
        apple2.color = "Green";
        apple2.taste = "sour";
        apple2.price = 0.75;
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste); // sour
        System.out.println(apple2.price); // 0.75

        System.out.println("\n---Printing the object with toString() in the class level---");
        System.out.println(apple1);
        System.out.println(apple2);
    }
}
