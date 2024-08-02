package exercicio1;

public class Product {
    protected String name;
    protected Double price;

    //construtores
    public Product(){}

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    //get's e set's
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    //função do exercicio
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f",getPrice());  
    }
}
