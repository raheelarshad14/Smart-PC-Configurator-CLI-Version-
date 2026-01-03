package SmartPCManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<Item> items = new ArrayList<>();

    Data() {
        items.add(new Item("\nAMD Ryzen 5 3600 – Socket: AM4\n", Things.CPU, 10));
        items.add(new Item("\nIntel Core i3-12100F – Socket: LGA1700", Things.CPU, 15));
        items.add(new Item("\nAMD Ryzen 5 5500 – Socket: AM4\n", Things.CPU, 20));
        items.add(new Item("\nAMD Ryzen 5 4600G – Socket: AM4\n", Things.CPU, 10));
        items.add(new Item("\nAMD Ryzen 5 2600 – Socket: AM4\n", Things.CPU, 15));
        items.add(new Item("\nAMD Ryzen 5 5600 – Socket: AM4\n", Things.CPU, 22));
        items.add(new Item("\nIntel Core i5-12400F – Socket: LGA1700\n", Things.CPU, 20));
        items.add(new Item("\nAMD Ryzen 7 5700X – Socket: AM4\n", Things.CPU, 16));
        items.add(new Item("\nAMD Ryzen 5 7500F – Socket: AM5\n", Things.CPU, 13));
        items.add(new Item("\nAMD Ryzen 5 8600G – Socket: AM5\n", Things.CPU, 10));
        items.add(new Item("\nIntel Core i5-14600K – Socket: LGA1700\n", Things.CPU, 17));
        items.add(new Item("\nAMD Ryzen 7 7800X3D – Socket: AM5\n", Things.CPU, 15));
        items.add(new Item("\nIntel Core i7-14700K – Socket: LGA1700\n", Things.CPU, 18));
        items.add(new Item("\nAMD Ryzen 9 7900X – Socket: AM5\n", Things.CPU, 13));
        items.add(new Item("\nIntel Core i9-14900K – Socket: LGA1700\n", Things.CPU, 11));

        System.out.println();

        items.add(new Item("\nGigabyte B450M DS3H V2 – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 20));
        items.add(new Item("\nMSI B450M-A PRO MAX II – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 14));
        items.add(new Item("\nASUS Prime H610M-K D4 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 15));
        items.add(new Item("\nBiostar B450MH – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 19));
        items.add(new Item("\nGigabyte H610M H V2 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 12));
        items.add(new Item("\nMSI B550M PRO-VDH WiFi – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 11));
        items.add(new Item("\n ASUS Prime B760M-K D4 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 15));
        items.add(new Item("\nGigabyte B760M DS3H AX – Socket: LGA1700 – Form Factor: Micro-ATX", Things.MOTHER_BOARD, 9));
        items.add(new Item("\nMSI PRO B650M-P – Socket: AM5 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 16));
        items.add(new Item("\nGigabyte B550M K – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 18));

        System.out.println();

        items.add(new Item("\nAMD Radeon RX 580\n", Things.GPU, 11));
        items.add(new Item("\nNVIDIA GeForce GTX 1660 SUPER", Things.GPU, 16));
        items.add(new Item("\nAMD Radeon RX 5600 XT\n", Things.GPU, 18));
        items.add(new Item("\nNVIDIA GeForce RTX 2060\n", Things.GPU, 11));
        items.add(new Item("\nAMD Radeon RX 5500 XT\n", Things.GPU, 19));
        items.add(new Item("\nAMD Radeon RX 6600\n", Things.GPU, 14));
        items.add(new Item("\nNVIDIA GeForce RTX 3060\n", Things.GPU, 16));
        items.add(new Item("\nNVIDIA GeForce RTX 4060\n", Things.GPU, 19));
        items.add(new Item("\nAMD Radeon RX 6700 XT\n", Things.GPU, 15));
        items.add(new Item("\nNVIDIA GeForce RTX 3060 Ti\n", Things.GPU, 11));
        items.add(new Item("\nNVIDIA GeForce RTX 4070 SUPER\n", Things.GPU, 19));
        items.add(new Item("\nAMD Radeon RX 7800 XT\n", Things.GPU, 17));
        items.add(new Item("\nNVIDIA GeForce RTX 4080 SUPER\n", Things.GPU, 18));
        items.add(new Item("\nAMD Radeon RX 7900 XTX\n", Things.GPU, 7));
        items.add(new Item("\nNVIDIA GeForce RTX 4090\n", Things.GPU, 20));

        System.out.println();

        items.add(new Item("\nLexar Desktop Memory – Type: DDR4\n", Things.RAM, 19));
        items.add(new Item("\nHikvision U10 / U100 – Type: DDR4\n", Things.RAM, 20));
        items.add(new Item("\nAdata XPG Gammix D30 – Type: DDR4\n", Things.RAM, 16));
        items.add(new Item("\nCorsair Vengeance LPX – Type: DDR4\n", Things.RAM, 13));
        items.add(new Item("\nTeamGroup T-Force Vulcan Z – Type: DDR4\n", Things.RAM, 11));
        items.add(new Item("\nCorsair Vengeance RGB PRO – Type: DDR4\n", Things.RAM, 18));
        items.add(new Item("\nG.Skill Ripjaws V – Type: DDR4\n", Things.RAM, 8));
        items.add(new Item("\nTeamGroup Delta RGB – Type: DDR4\n", Things.RAM, 9));
        items.add(new Item("\nAdata XPG Lancer – Type: DDR5\n", Things.RAM, 13));
        items.add(new Item("\nKingston Fury Beast – Type: DDR5\n", Things.RAM, 16));
        items.add(new Item("\nG.Skill Trident Z5 Neo RGB – Type: DDR5\n", Things.RAM, 17));
        items.add(new Item("\nCorsair Vengeance RGB DDR5 – Type: DDR5\n", Things.RAM, 18));
        items.add(new Item("\nTeamGroup Delta RGB White – Type: DDR5\n", Things.RAM, 20));
        items.add(new Item("\nCorsair Dominator Platinum – Type: DDR5\n", Things.RAM, 13));
        items.add(new Item("\nAdata XPG Lancer RGB – Type: DDR5\n", Things.RAM, 17));

        System.out.println();

        items.add(new Item("\nThunder Furor TGC-225W – Form Factor: ATX\n", Things.CASING, 20));
        items.add(new Item("\n1st Player DK3 – Form Factor: ATX\n", Things.CASING, 20));
        items.add(new Item("\nEASE EC144B Tempered Glass – Form Factor: ATX\n", Things.CASING, 15));
        items.add(new Item("\nBoost Wolf Series – Form Factor: Micro-ATX\n", Things.CASING, 14));
        items.add(new Item("\nAigo Darkflash A290 – Form Factor: Micro-ATX\n", Things.CASING, 9));
        items.add(new Item("\nMontech Sky Two – Form Factor: ATX\n", Things.CASING, 17));
        items.add(new Item("\nDeepCool CH560 Digital – Form Factor: E-ATX", Things.CASING, 19));
        items.add(new Item("\nLian Li Lancool 216 – Form Factor: E-ATX\n", Things.CASING, 17));
        items.add(new Item("\n1st Player Steampunk SP8 – Form Factor: ATX\n", Things.CASING, 11));
        items.add(new Item("\nCorsair 3000D Airflow – Form Factor: ATX\n", Things.CASING, 15));
        items.add(new Item("\nLian Li O11 Dynamic EVO – Form Factor: E-ATX\n", Things.CASING, 18));
        items.add(new Item("\nHyte Y60 – Form Factor: E-ATX\n", Things.CASING, 19));
        items.add(new Item("\nLian Li O11 Vision – Form Factor: E-ATX\n", Things.CASING, 14));
        items.add(new Item("\nNZXT H9 Flow – Form Factor: ATX\n", Things.CASING, 13));
        items.add(new Item("\nCorsair 5000D Airflow – Form Factor: ATX", Things.CASING, 11));

    }

    public void restock() {
        restockSimple(items);
    }

    public void stockDisplay() {

        System.out.println("----* STOCK OVERVIEW *----");

        for (Things t : Things.values()) {
            System.out.println();
            System.out.println(" " + t + ": ");


            for (Item i : items) {
                if (i.getThings() == t) {
                    i.showRecord();

                }
            }
            System.out.println(" ------------- ");
        }

    }

    public void restockSimple(ArrayList<Item> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Category to Restock:");
        Things[] cats = Things.values();
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + ". " + cats[i]);
        }

        int catIndex = sc.nextInt();
        Things selected = cats[catIndex];

        // print category items with fresh index
        System.out.println("Items in " + selected + ":");
        ArrayList<Item> temp = new ArrayList<>();
        for (Item i : list) {
            if (i.getThings() == selected) temp.add(i);
        }

        for (int i = 0; i < temp.size(); i++) {
            System.out.println(i + " -- " + temp.get(i).getName() + " (" + temp.get(i).getUnit() + ")");
        }

        System.out.print("Enter index to restock: ");
        int idx = sc.nextInt();

        System.out.print("Enter units to add: ");
        int units = sc.nextInt();

        temp.get(idx).addStock(units);


        System.out.println("Restocked Successfully!");
    }
}