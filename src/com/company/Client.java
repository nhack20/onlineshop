package com.company;

class Client{

    private String name;
    private int phone;
    private int price;

    public Client() {
    }

    public Client(String name, int phone, int price) {
        this.name = name;
        this.phone = phone;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", price=" + price +
                '}';
    }
}