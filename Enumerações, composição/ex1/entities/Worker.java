package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Deparment deparment;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Deparment deparment){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.deparment = deparment;
    }

    //gets and sets
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    public Deparment getDeparment() {
        return deparment;
    }
    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //add or remove itens in the array "contracts"
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
}
