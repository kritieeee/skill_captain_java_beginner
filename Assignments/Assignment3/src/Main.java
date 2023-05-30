// Write a Java program that takes input from the user for their age (an integer value) and their name (a string value).
//            The program should store the age as a primitive type (int) and the name as a boxed type (String).
//            The program should then print out a message that says "Hello, [name]! You are [age] years old."


import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your age");
        int age = s.nextInt();
        System.out.println("Hello, " +name +"! You are "+age + " years old.");


    }
}