package org.launchcode.java.demos.lsn6inheritance.technology;

public class SmartPhone extends Computer{
    // add 1 additional property and 1 additional method
    private String phoneNumber;

    public SmartPhone (String deviceName, String internetConnection, String phoneNumber){
        super (deviceName, internetConnection);
        this.phoneNumber = phoneNumber;
    }
}
