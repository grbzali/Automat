package gurbuzali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double inputMoney;
        int productNumber;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter amount: 0,50,1,5,10TL");
            while (!scan.hasNextDouble()) {
                System.out.println("Please enter valid amount: 0,50,1,5,10TL");
                scan.next();
            }
            inputMoney = scan.nextDouble();
        } while (inputMoney != 0.5 && inputMoney != 1 && inputMoney != 5 && inputMoney != 10);

        AutomatImp automat = new AutomatImp(inputMoney);
        System.out.println("Balance: " + automat.getBalance() + "TL");

        while (automat.getBalance() != 0) {


            do {
                System.out.println("Choose product: 0-Kola:0,15TL 1-Fanta:0,20TL 2-Gazoz:0,30TL");
                while (!scan.hasNextInt()) {
                    System.out.println("Please enter 0,1,2");
                    scan.next();
                }
                productNumber = scan.nextInt();
            } while (productNumber != 0 && productNumber != 1 && productNumber != 2);

            System.out.println(automat.shopping(productNumber));
            System.out.println("Balance: " + automat.getBalance() + "TL");

        }
        System.out.println("balance is over");
    }
}
