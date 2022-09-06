package exercises;

public class SingleLine {
    public static void main (String[] args) {
        int[] singleLine = {1, 1, 2, 3, 5, 8};

        for (int i : singleLine) {
            if (i% 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
