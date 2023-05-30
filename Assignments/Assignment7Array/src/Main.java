
//Write a Java program that prompts the user to enter 5 integer values and stores them in an array.
//The program should then find and print the sum, average, maximum, and minimum of the values in the array.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int sum=0;
        int[] a = new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<5;i++)
        {
            System.out.println("Enter number " + (i+1) );
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double average = sum/5;
        int min = a[0];
        int max = a[0];
        for(int i =0;i<5;i++)
        {
            if (min>a[i])
            {
                min =a[i];
            }
            if (max<a[i])
            {
                max=a[i];
            }

        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Maximum is  " + max);
        System.out.println("Minimum is " + min);
        sc.close();
    }
}