package BankProblem;

public class Account {
    private int number;
    private String holder;
    private double balance;

    //Construtor com 3 variaveis, caso exista um depósito incial
    public Account(int numAccount, String nameOwner, double balanceAccount){
        this.number = numAccount;
        this.holder = nameOwner;
        deposit(balanceAccount);
    }
    //Construtor com apenas 2 variaveis caso nao exista deposito inicial (balance será 0)
    public Account(int numAccount, String nameOwner){
        this.number = numAccount;
        this.holder = nameOwner;
    }

    //Funções get e set (Não há set para o numero e para o montante devido a proteção dessas variaveis)
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

    //métodos de depósito e saque
    public void deposit(double value){
        balance += value;
    }
    public void withdraw(double value){
        balance -= value + 5.0;
    }

    //método para printar diretamente
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance:"
                + balance;
    }
}
