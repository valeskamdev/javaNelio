package aula.product.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // retorna o valor total de todos os itens no estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // adiconando produtos
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // removendo produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
