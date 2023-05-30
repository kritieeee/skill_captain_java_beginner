
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 ");

        int n1 = s.nextInt();
        System.out.println("Enter number 2 ");
        int n2 = s.nextInt();

            System.out.println("The greater number is " + (n1>n2?n1:n2));


    }
}