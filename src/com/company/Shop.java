package com.company;

public class Shop {
    String name;
    String address;

    public Shop() {
    }

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shop{" + "name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
