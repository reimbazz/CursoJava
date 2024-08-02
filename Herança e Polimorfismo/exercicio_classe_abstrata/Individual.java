package exercicio_classe_abstrata;

public class Individual extends TaxPayer{
    private Double healthExpenditures;
    
    //construtor
    public Individual(){super();}

    public Individual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //get e set
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //desenvolvimento do metodo abstrato
    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
        }
        else{
            return (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
        }
    }
}
