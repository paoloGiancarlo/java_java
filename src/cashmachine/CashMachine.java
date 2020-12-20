package cashmachine;

import java.util.Scanner;

public class CashMachine {
    public Scanner consoleInput = new Scanner(System.in);
    private int itemCount;
    private double tax;
    private double sum;
    private String receipt;

    public CashMachine(double tax) {
        this.tax = tax;
    }

    public String getOneStringInput(String s) {
        System.out.println(s);
        return consoleInput.nextLine();
    }

    public double getOneDoubleInput(String s1) {
        System.out.println(s1);
        return consoleInput.nextDouble();
    }

    public int getItemCount() {
        return itemCount;
    }

    public double calculateTax() {
        return sum * tax;
    }

    public double calculateTaxPlusSum() {
        return sum + this.calculateTax();
    }

    public boolean processMenu() {

        double userInput = getOneDoubleInput("Action>>");
//        userInput=consoleInput.nextDouble();
        if (userInput == 1) {
            purchaseItem();
            return true;
        } else if (userInput == 2) {
            printReceipt();
//            return true;
        } else if (userInput == 3) {
            return false;
        }
        return true;
    }

    public void purchaseItem() {

        String itemName = getOneStringInput("item name (no spaces) >> ");
        itemName = consoleInput.next();
        double itemPrice = getOneDoubleInput("item price >>");
        itemCount += 1;
        sum += itemPrice;
//        System.out.printf("%-15s$%.2f%n",itemName,itemPrice);
        receipt += String.format("%-15s$%.2f%n", itemName, itemPrice);
    }

    public void printMenu() {
        System.out.println("\n1)Purchase Item \n2)Print Receipt \n3)Quit \n");

    }

    public void printReceipt() {
        System.out.println("");
        if (itemCount == 0) {
            System.out.println("Empty!!");
        } else {
            System.out.println("Receipt for " + getItemCount() + " items");
            System.out.println(" \n" + receipt);
            System.out.printf("Tax      $%.2f %n", calculateTax());
            System.out.printf("Total    $%.2f %n", calculateTaxPlusSum());
        }
    }
}

