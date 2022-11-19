package mutable_immutable;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";
        String address = "Chicago";

        city = "Miami"; //Reassigned but initial value is still in the String Pool until the end of the program (if not re-used)
    }
}
