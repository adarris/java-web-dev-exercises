package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {
    // add 1 additional property and 1 additional method
    private boolean hasFullSizeKeyBoard;

    public Laptop(String deviceName, String internetConnection, boolean hasFullSizeKeyBoard) {
        super (deviceName, internetConnection);
        this.hasFullSizeKeyBoard = hasFullSizeKeyBoard;
    }
}
