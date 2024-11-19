/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kenie
 */
public class product1 {
    private String name;
    private String amount;
    private String price;
    private Double total;

    public product1(String name, String amount, String price, Double total) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    public Double Total () {
        double numAmount = Double.parseDouble(amount);
    double numPrice = Double.parseDouble(price);
    total = numAmount * numPrice;
    return total;
    }
}
