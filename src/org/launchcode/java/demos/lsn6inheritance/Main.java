package org.launchcode.java.demos.lsn6inheritance;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true
    }
}
