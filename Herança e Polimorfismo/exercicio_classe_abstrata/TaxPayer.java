package exercicio_classe_abstrata;

public abstract class TaxPayer {
    protected String name;
    protected Double anualIncome;

    //construtor
    public TaxPayer(){}

    public TaxPayer(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }
     
    //get's e set's
    public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //metodo abstrato
    public abstract Double tax();
}
