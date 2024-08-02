package exercicio_de_fixação0;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;

    //construtores
    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    public OutsourceEmployee(){
        super();
    }

    //get's e set's
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
