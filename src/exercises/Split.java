package exercises;

import java.util.Arrays;

public class Split {
    public static void main (String[] args) {
        String string = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //String[] stringNoSpace = string.split(" ");
        //String backToString = Arrays.toString(stringNoSpace);

        String[] separateSentences = string.split("\\.");

        System.out.println(Arrays.toString(separateSentences));
    }
}
