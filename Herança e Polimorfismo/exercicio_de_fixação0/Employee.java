package exercicio_de_fixação0;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    //construtores
    public Employee(){}

    public Employee(String name, Integer hours, Double valuePerHour){
        this.hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    //get's e set's
    public Integer getHours() {
        return hours;
    }
    public String getName() {
        return name;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return hours * valuePerHour;
    }
}
