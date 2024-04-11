## Problema
O exercício pede um sistema bancário simples, onde o usuário informa o número da conta, o nome do proprietário da conta e se existe um deposito inicial.
Após isso ele realizará 2 ações, um outro deposito e um saque. O valor deve ser abatido do saldo da conta aplicando uma taxa de 5 reais a cada saque.

# Arquivo suporte
Em um arquivo `Account.java` foi declarado a classe "Account" e os métodos get e set, além do contrutor da classe.

Após isso é realizado as funções de depósito e saque, além de uma função chamada "toString" para que a classe possa ser printada diretamente. 

Segue o código presente no arquivo mencionado
```
package BankProblem;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int numAccount, String nameOwner, double balanceAccount){
        this.number = numAccount;
        this.holder = nameOwner;
        deposit(balanceAccount);
    }
    public Account(int numAccount, String nameOwner){
        this.number = numAccount;
        this.holder = nameOwner;
    }

    public int getNumAccount(){
        return this.number;
    }
    public void setNameOwner(String name){
        this.holder = name;
    }
    public String getNameOwner(){
        return this.holder;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double value){
        balance += value;
    }
    public void withdraw(double value){
        balance -= value + 5.0;
    }
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance:"
                + balance;
    }
}
```
Arquivo `Account.java` possui os comentários explicando detalhadamente os métodos. 

# Arquivo principal
No arquivo pincipal chamado `Prog.java` foi importado o arquivo suporte e realizado os comandos necessários para a resolução do desafio.

Primeiramente são realizadas as leituras das váriaveis que serão colocadas na classe account, após isso o usuario informa se há ou nao o deposito inicial, caso sim ele deverá informar o valor do depósito, 
após isso ele informa novamente o valor de saque e de depósitos seguintes e o sistema devolve printando a classe com o montante correto

Segue abaixo o código "main":
```
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

        System.out.println("Enter account number: ");
        num = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();
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
        
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        balance = sc.nextDouble();
        account.deposit(balance);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdraw(balance);

        System.out.println("Updated account: ");
        System.out.println(account);
        
        sc.close();
    }
}
```
O arquivo `Prog.java` possui os comentários explicando detalhadamente o processo.
