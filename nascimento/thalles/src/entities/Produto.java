package nascimento.thalles.src.entities;

import org.w3c.dom.ls.LSOutput;

public class Produto {
    private String name;
    private double price;
    private int quantity;

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double valorTotalEmEstoque(){
        double valorTotal = this.price * this.quantity;
        return valorTotal;
    }

    public void addProduto(int quantidade){
        this.quantity += quantidade;
        // this.quantity = this.quantity + quantidade;
    }

    public void rmProduto(int quantidade){
        this.quantity -= quantidade;
        // this.quantity = this.quantity - quantidade;
    }

    public String toString(){
        return "Produto: "
                + this.getName()
                + ", $ "
                + String.format("%.2f", this.getPrice())
                + ", "
                + this.getQuantity()
                + " units, Total: $ "
                + String.format("%.2f", this.valorTotalEmEstoque());
    }

}
