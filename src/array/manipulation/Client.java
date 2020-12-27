package array.manipulation;

import java.util.Scanner;


public class Client {
    private String name;
    private int clientNumber;

    public Client() {
        this("unassigned", -1);
    }

    public Client(String name, int clientNumber) {
        this.name = name;
        this.clientNumber = clientNumber;

    }

    public static void main(String[] args) {
        final int numberOfClients = 2;
        Client[] clients = new Client[numberOfClients];

        for (int i = 0; i < numberOfClients; i++) {
            clients[i] = new Client();
            System.out.println("Enter information for Client " + (i + 1));
            clients[i].keyboardClientInfo();
        }

        System.out.println("List of Client \n ");
        for (int i = 0; i < numberOfClients; i++) {
            clients[i].displayClientInfo();
        }

    }

    public void keyboardClientInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Client name: ");
        name = input.nextLine();
        System.out.print("Client number: ");
        clientNumber = input.nextInt();

    }

    public void displayClientInfo() {
        System.out.println("Client Name: " + name + " Client Number: " + clientNumber);
    }
}

