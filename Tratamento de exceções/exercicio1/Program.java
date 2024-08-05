package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.println("Number: " );
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Holder: ");
            String name = sc.nextLine();
            System.out.println("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.println("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            System.out.println();

            Account x = new Account(num, name, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            x.withdraw(withdraw);

            System.out.println();
            System.out.println("New balance: " + x.getBalance());

            sc.close();
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
