package class_object;

public class Fruit {
    public Fruit(){}

    public static int numberOfFruits = 0;
    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;

    //Instance Block is executed for each object being created
    {
        System.out.println("A new object of Fruit is created");
        numberOfFruits++;
        System.out.println("So far, you created " + numberOfFruits + " Fruit object");
    }

    //Static Block is executed only one and before everything else in the same class
    static{
        //connect to file here and read data
        hasColor = true;
        System.out.println("This is a static block");
    }
}
