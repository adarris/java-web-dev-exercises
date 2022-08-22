package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How much gas have you consumed(in gallons)?");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("Your miles-per-gallon is: " + mpg);
    }
}
