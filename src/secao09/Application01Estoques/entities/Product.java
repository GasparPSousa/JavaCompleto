package secao09.Application01Estoques.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    } // Nesse caso, não vou criar o método setQuantity. Pois dessa forma, vou proteger meu objeto product de alterações INCONSISTENTES na quantidade dele.
        // A quantidade de produtos SÓ PODE MUDAR por meio das operações entrada e saída do Estoque.
        // Dessa forma eu consigo proteger que a quantidade do meu produto sempre esteja em um estado consistente.
        // Ela só vai mudar quando houver uma entrada ou uma saída e não diretamente pelo método setQuantity

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());

    }

}
