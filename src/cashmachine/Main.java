package cashmachine;

/*
Author: Paolo Ignacio
 */
public class Main {
    public static void main(String[] args) {
        CashMachine cash = new CashMachine(0.15);
        System.out.println("Welcome to CashMachine!!!");

        do {
            cash.printMenu();
        } while (cash.processMenu());
        System.out.println("");
        System.out.println("");
        System.out.println("Bye");

    }
}

