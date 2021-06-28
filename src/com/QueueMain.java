package com;

import java.util.Scanner;

public class QueueMain {
	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        QueueOperation Queue = new QueueOperation();

        boolean flag = true;

        while (flag) {
            int choice = userMenu();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element you want to insert to the stack: ");
                    int element = input.nextInt();
                    Queue.enqueue(element);
                    flag = true;
                    break;
                case 2:
                    Queue.dequeue();
                    flag = true;
                    break;
                case 3:
                    Queue.display();
                    flag = true;
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }

    public static int userMenu() {
        System.out.println("Press 1 to Enqueue");
        System.out.println("Press 2 to Dequeue");
        System.out.println("Press 3 to Display");
        System.out.println("Press 4 to Quit");

        int choice = input.nextInt();

        return choice;
    }
}
