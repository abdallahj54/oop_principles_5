package test;

import access_modifiers.package1.Honda;

public class Test {
    public static void main(String[] args) {
        Honda h1 = new Honda();
        System.out.println(h1); //access_modifiers.package1.Honda@1540e19d

        //Tesla t1 = new Tesla(); //Cannot be accessed as it is default class (only works in the original package and its classes)
    }
}
