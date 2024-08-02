package exercicio1;

public class ImportedProduct extends Product{
    private Double customsFee;

    //construtores
    public ImportedProduct(){super();}

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    //get e set
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    //funções pedidas
    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f",totalPrice()) + " (Customs fee: $ " + String.format("%.2f",customsFee) + ")" ;
    }
    public Double totalPrice(){
        return price + customsFee;
    }
}
