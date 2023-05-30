//Write a Java program that uses a for loop to print out the numbers from 1 to 10.
//Then, write another program that uses a while loop to print out the even numbers between 1 and 20.
//Finally, write a program that uses a do-while loop to prompt the user to enter a number between 1 and 10, and keeps prompting until a valid number is entered.
//Once a valid number is entered, the program should print out a message that says "You entered [number]."
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int i;
        int n=1;
        Scanner s = new Scanner(System.in);
        for (i=1;i<=10;i++)
        {
            System.out.println(" "+i);
        }
        while (n<=20)
        {
            if(n%2==0)
            {
                System.out.println(" "+ n);
            }
            n++;
        }
        int num;
        do
            {
                System.out.println("Enter a valid number between 1 -10 ");
                num = s.nextInt();

            }while(num<0 || num>=10);


        System.out.println("You entered " + num);
    }
}