package org.example;

import java.util.Scanner;

public class AnishDocker {
    private String name;

    public AnishDocker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   // display name
    public void displayName() {
        System.out.println("Your name is " +  name);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        AnishDocker user = new AnishDocker(name);
        user.displayName();
    }
}
