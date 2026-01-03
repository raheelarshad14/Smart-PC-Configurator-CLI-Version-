package SmartPCManager;

import java.io.FileWriter;
import java.io.IOException;

public class Builder {
    public CPU selectedCPU;
    public Motherboard selectedMotherboard;
    public GPU selectedGPU;
    public RAM selectedRAM;
    public Casing selectedCasing;

    public int calculateTotal(){
        return selectedCPU.getPrice() + selectedMotherboard.getPrice() + selectedGPU.getPrice()
                + selectedRAM.getPrice() + selectedCasing.getPrice();
    }

    public void printReceipt() {
        try {
            FileWriter writer = new FileWriter("PC_Receipt.txt");
            writer.write("-------------------------------------\n");
            writer.write("           Smart PC Manager          \n");
            writer.write("-------------------------------------\n");
            writer.write("CPU:   " + selectedCPU.getName() + " (" + selectedCPU.getPrice() + ")\n");
            writer.write("MOBO:  " + selectedMotherboard.getName() + " (" + selectedMotherboard.getPrice() + ")\n");
            writer.write("RAM:   " + selectedRAM.getName() + " (" + selectedRAM.getPrice() + ")\n");
            writer.write("GPU:   " + selectedGPU.getName() + " (" + selectedGPU.getPrice() + ")\n");
            writer.write("CASE:  " + selectedCasing.getName() + " (" + selectedCasing.getPrice() + ")\n");
            writer.write("-------------------------------------\n");
            writer.write("TOTAL: Rs. " + calculateTotal() + "\n");
            writer.write("-------------------------------------\n");
            writer.close();
            System.out.println("\n[SUCCESS] Receipt saved to 'PC_Receipt.txt'");
        } catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
    }


}