package exercises;

import com.sun.applet2.AppletParameters;

import java.util.Map;
import java.util.Scanner;

public class HashMapp {
    private static AppletParameters classRoster;

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("What is the name of your student?");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.println("What is " + name + "'s ID number?");
                int id = input.nextInt();
                classRoster.put(id, name);
            }
        } while (!name.equals(""));

        input.close();

        System.out.println("\nClass Roster:");

        for (Object student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
