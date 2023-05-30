import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 ");

        int n1 = s.nextInt();
        System.out.println("Enter number 2 ");
        int n2 = s.nextInt();
        double result =0;
        System.out.println("Enter operation to be performed");
        char op = s.next().charAt(0);
        if (op =='+')
        {
            result = n1+n2;
        }
        else if(op=='-')
        {
            result = n1-n2;
        }
        else if(op=='*')
        {
            result=n1*n2;}
        else if (op=='/')
        {
            result = n1/n2;
        }
        else
        {
            System.out.println("Invalid Input");
        }
        System.out.println("Result is  "+ result);






    }
}