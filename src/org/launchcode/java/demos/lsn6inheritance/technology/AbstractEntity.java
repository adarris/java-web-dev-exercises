package org.launchcode.java.demos.lsn6inheritance.technology;

public class AbstractEntity {
    private static int counter = 1;
    private int id;

    public AbstractEntity(){
        this.id = counter;
        counter++;
    }
    public int getId (){
       return id;
    }
}
