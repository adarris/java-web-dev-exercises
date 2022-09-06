package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        int[] integers = {1, 7, 6, 4, 6, 7, 1, 6, 4, 6, 8};

        int sum = 0;

        for (int i : integers) {
            if (i%2 == 0) {
                sum += i;
                //System.out.println(sum);
            }
        }
    }
    public static void wordlist (String[] args) {
        String[] list = {"who", "what", "where", "when", "why"};
        Scanner input = new Scanner(System.in);


        System.out.println("enter a word length: ");
        int wordLength = input.nextInt();

        for (String fives: list){
            if (fives.length() == wordLength){
                System.out.println(fives);
            }
        }
    }
}
