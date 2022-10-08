package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity{
    //add 3 properties(device name, internet connection, bluetooth device), 2 methods(internet searching, apps) , and a constructor
    private String deviceName;
    private String internetConnection;
    private String searchWord;
    private String[] platform = {"Google Chrome", "Firefox", "Safari"};
    private String applicationName;
    private String searching = "Searching... [beep b00p borpp]";
    public Computer (String deviceName, String internetConnection){
        this.deviceName = deviceName;
        this.internetConnection = internetConnection;
    }
    public String internetSearching (String searchWord, String[] platform){
        System.out.println("What would you like to search? ");
        //String searchWord = nextline;

        System.out.println("Which platform would you like to search on? " + platform);

        return searching;
    }
    public void application (String applicationName){
        this.applicationName = applicationName;
    }
}
