import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static ArrayList GL = new ArrayList<>();
    public static void main(String args[])
    {
        while(true) {


            Scanner s = new Scanner(System.in);
            System.out.println("Grocery List Manager");
            System.out.println("--------------------");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Print grocery list");
            System.out.println("4. Check item existence");
            System.out.println("5. Clear grocery list");
            System.out.println("6. Quit");
            System.out.print("Enter your choice number: ");
            int choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
                System.out.print("Enter the item to add: ");
                String item = s.nextLine();
                GL.add(item);
                System.out.println("Item added!");
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter the item to remove: ");
                String item = s.nextLine();
                boolean removed = GL.remove(item);
                if (removed) {
                    System.out.println("Item removed!");
                } else {
                    System.out.println("Item not found in the grocery list.");
                }
                System.out.println();
            } else if (choice == 3) {
                if (GL.isEmpty()) {
                    System.out.println("empty.");
                } else {
                    System.out.println("Grocery List:");
                    for (int i = 0; i < GL.size(); i++) {
                        System.out.println((i + 1) + ". " + GL.get(i));
                    }
                }
                System.out.println();
            } else if (choice == 4) {
                System.out.print("Enter the item to check: ");
                String item = s.nextLine();
                boolean exists = GL.contains(item);
                if (exists) {
                    System.out.println("The item is already on the grocery list.");
                } else {
                    System.out.println("The item is not on the grocery list.");
                }
                System.out.println();
            } else if (choice == 5) {
                GL.clear();
                System.out.println("Grocery list cleared.");
                System.out.println();
            } else if (choice == 6) {
                s.close();
                System.exit(0);

            } else {
                System.out.println("Please try again wrong input");
            }
        }

    }


}