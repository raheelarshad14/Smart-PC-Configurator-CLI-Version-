package SmartPCManager;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=======================================");
            System.out.println("            SMART PC MANAGER");
            System.out.println("=======================================");
            System.out.println("1. Inventory Management (Store)");
            System.out.println("2. Smart PC Builder");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine().trim();

            switch (choice) {

                case "1":

                    StoreMain.startStore();
                    break;

                case "2":

                    SmartPCTest.startBuilder();
                    break;

                case "3":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
