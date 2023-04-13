package com.hdsoft.fsm.purchase.model;

import java.util.Objects;

public class Item {
    private String name;
    private double amount;

   public Item(){

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.amount, amount) == 0 && name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
