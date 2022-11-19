package mutable_immutable;

public class Practice_StringBuilder {
    public static void main(String[] args) {
        StringBuilder city = new StringBuilder("Chicago");

        System.out.println(city);

        city = new StringBuilder("Miami");

        String name = "Alex";
        name += "ander"; //concatenating names initial value and this value

        System.out.println(name); //Alexander

        city.append("xxx"); //this is done instead of += as this is StringBuilder not a regular string
        System.out.println(city); //Miamixxx
    }
}
