package org.launchcode.java.demos.lsn6inheritance.technology;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer("Aj's device", "Ranchito");
        Laptop laptop = new Laptop("Aj's laptop", "Ranchito", false);
        SmartPhone smartPhone = new SmartPhone("Aj's phone", "Ranchito","314-315-3817");

        computer.application("MergeMansion");
    }
}
