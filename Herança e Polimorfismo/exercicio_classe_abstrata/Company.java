package exercicio_classe_abstrata;

public class Company extends TaxPayer{
    private Integer numberEmployees;

    //construtores 
    public Company(){super();}

    public Company(String name, Double anualIncome, Integer numberEmployees){
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    //get e set
    public Integer getNumberEmployees() {
        return numberEmployees;
    }
    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    //modificação da classe abstrata
    @Override
    public Double tax() {
        if (numberEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        else{
            return getAnualIncome() * 0.16;
        }
    }
}
