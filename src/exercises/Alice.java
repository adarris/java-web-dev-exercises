package exercises;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String sentenceAlice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'\n";
        sentenceAlice = sentenceAlice.toLowerCase();
        System.out.println(sentenceAlice);

        System.out.println("Type a word to see if it is in the first sentence of Alice's Adenvtures in Wonderland");
        String search = input.nextLine();
        search.toLowerCase();

        Boolean found = false;

        if (sentenceAlice.indexOf(search) != -1){
            found = true;
            System.out.println("Yes, that's is part of the string");
        }
    }
}
