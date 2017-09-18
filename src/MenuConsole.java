
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguyenhung
 */
public class MenuConsole {

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        menu.createMenu();
    }

    public void createMenu() {
        while (true) {
            System.out.println("The Airline Reservation System");
            System.out.println("1.Add reservation");
            System.out.println("2.Modify passenger records");
            System.out.println("3.Display passenger records");
            System.out.println("4.Exit");
            System.out.println("Chọn: ");

            int choice = 0;
            Scanner sc = new Scanner(System.in);
            String strChoice = sc.nextLine();

            try {
                choice = Integer.parseInt(strChoice);
            } catch (java.lang.NumberFormatException e) {
                System.err.println("Hãy nhập vào 1 số");
                continue;
            } finally {
                System.out.println("");
            }
            PassengerController pc = new PassengerController();
            if (choice == 5) {

            } else {
                switch (choice) {
                    case 1:
                        pc.addPassenger();
                        break;
                    case 2:
                        pc.modifyPassenger();
                        break;
                    case 3:
                        pc.displayPassenger();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
