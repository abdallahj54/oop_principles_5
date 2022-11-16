package oopPractice;

public class Sword {
    //default constructor
    public Sword(){}

    // Modified Constructor for 1 arg
    public Sword(String material) {
        this.material = material;
    }

    // Modified Constructor for all non-static variables
    public Sword(double weight, double length, String name, String material) {
        this.weight = weight;
        this.length = length;
        this.name = name;
        this.material = material;
    }

    // 2. Instance Variables

        // Static Ones -> Belongs to the class, What does every sword have?
    public static final boolean hasHandle = true;
    public static boolean isSharp;

        // Non-Static Ones -> Belongs to the Object, What is changing sword by sword
    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Methods

        // Static ones -> Belongs to the class, What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    public static void damage(){
        if(isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages less");
    }

        // Non-Static -> Belongs to the object, What does every sword do differently?
            // Weight * Length = 2lbs * 10in = 20 points
            // Weight * Length = 10lbs * 15in = 150 points
    public void harms(){
        System.out.println("Sword damage = " + (weight * length) + " points.");
    }

    // Running only ONCE before EVERYTHING
    static{
        System.out.println("Starting the sword making furnace");
    }

    // Running everytime when you create object before everything after static code block
    {
        System.out.println("Heating up the furnace");
    }

    // toString() Method
    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

}
