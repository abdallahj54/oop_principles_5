package class_object;

public class Apple {

    //Default constructor is provided by Java to create zero argument object
    public Apple(){
        //Each time you created a new object, this block will be executed
    }

    //Overloading constructor with 3 args
    public Apple(String color, double price, String taste) {
        this.color = color;
        this.price = price;
        this.taste = taste;
    }

    //instance variables - fields - states - attributes
    public String color; // null (default value)
    public double price; // 0.0 (default value)
    public String taste; // null (default value)


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
