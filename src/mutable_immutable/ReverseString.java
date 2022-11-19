package mutable_immutable;

public class ReverseString {

    //Create a method that takes a String and returns it back reversed
    public static String reverseString(String str){
        StringBuilder result = new StringBuilder(str); //Hello
        result.reverse();
        return  new StringBuilder(str).reverse().toString();
    }

    //Create a method that takes a string and returns true if it is a palindrome
    public static boolean isPalindrome(String str){
        //return str.equals(new StringBuilder(str).reverse().toString());
       return new StringBuilder(str).reverse().toString().equals(str);
    }


    public static void main(String[] args) {
        System.out.println("---reverseString() Method---");
        System.out.println(reverseString("Hello")); //olleH
        System.out.println(reverseString("Java")); //avaJ
        System.out.println(reverseString("")); //(empty)
        System.out.println(reverseString("a")); //a
        System.out.println(reverseString("1234")); //4321
        System.out.println(reverseString("Good morning")); //gninrom dooG

        System.out.println("\n---isPalindrome() Method---");
        System.out.println(isPalindrome("civic")); //true
        System.out.println(isPalindrome("madam")); //true
        System.out.println(isPalindrome("Madam")); //false
        System.out.println(isPalindrome("hello")); //false
    }
}
