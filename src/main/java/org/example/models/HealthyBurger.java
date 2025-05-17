package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    private double totalPrice;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
        this.totalPrice = price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.totalPrice += healthyExtra1Price;

        System.out.println();
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        this.totalPrice += healthyExtra2Price;

        System.out.println();
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Addition1: " + healthyExtra1Name + " Addition2: " + healthyExtra2Name);

        return totalPrice;
    }

    @Override
    public double getPrice() {
        return this.totalPrice;
    }

}