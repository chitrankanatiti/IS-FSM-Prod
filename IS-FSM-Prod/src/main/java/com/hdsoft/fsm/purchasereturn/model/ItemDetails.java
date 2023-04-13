package com.hdsoft.fsm.purchasereturn.model;

import java.util.Objects;

public class ItemDetails {
    private String name;
    private String qty;

    public ItemDetails(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQty() {
        return qty;
    }
    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemDetails)) return false;
        ItemDetails that = (ItemDetails) o;
        return name.equals(that.name) && qty.equals(that.qty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, qty);
    }


    @Override
    public String toString() {
        return "ItemDetails{" +
                "name='" + name + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
