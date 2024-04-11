package BankProblem;
import java.util.Scanner;
import java.util.Locale;

import BankProblem.Account;

public class Prog {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        double balance;
        String name;
        Account account;

        //Leitura das variaveis
        System.out.println("Enter account number: ");
        num = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();

        //Verificação se há depósito inicial
        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            balance = sc. nextDouble();
            account = new Account(num, name, balance);
        }
        else {
            account = new Account(num, name);
        }   
        
        //Primeiro print da classe
        System.out.println("Account data:");
        System.out.println(account);

        //Operação de depósito
        System.out.println("Enter a deposit value: ");
        balance = sc.nextDouble();
        account.deposit(balance);

        //Print da conta atualizada
        System.out.println("Updated account data: ");
        System.out.println(account);

        //Operação de saque
        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdraw(balance);

        //Conta atualizada novamente
        System.out.println("Updated account: ");
        System.out.println(account);

        sc.close();
    }
}
