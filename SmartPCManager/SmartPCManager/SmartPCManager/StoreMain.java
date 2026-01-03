package SmartPCManager;

import java.util.Scanner;

public class StoreMain {
    public static void startStore() {
        Scanner sc = new Scanner(System.in);
        Data store = new Data();

        System.out.println("Welcome to TechStore Inventory Manager!");

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Show Stock Overview");
            System.out.println("2. Go to Restock Menu");
            System.out.println("3. Exit Program");
            System.out.print("Choose option: ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    store.stockDisplay();
                    break;
                case "2":
                    store.restock();
                    break;
                case "3": {
                    System.out.println("Goodbye!");
                    return;
                }

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
