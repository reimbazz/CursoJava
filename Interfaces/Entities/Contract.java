package Entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    //constructor
    public Contract(Integer number, LocalDate date, Double totalValue){
        this.totalValue = totalValue;
        this.date = date;
        this.number = number;
    }

    //get e set
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    public List<Installment> getInstallments() {
        return installments;
    }
}
