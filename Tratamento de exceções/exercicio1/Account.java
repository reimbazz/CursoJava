package exercicio1;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //construtores
    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.balance = balance;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    //get's e set's
    public Double getBalance() {
        return balance;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //saque e deposito
    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainException("Not enough balance");
        }
        balance -= amount;
    }  

}
