package com.company;

public class WomanServices implements Makeup,Manicure{

    @Override
    public void makeupservice(int price, int quantity) {
        price=2000;
        int total;
        System.out.println(total=price*quantity);
    }

    @Override
    public void manicure(int price, int quantity) {
        price=5000;
        int total;
        System.out.println(total=price*quantity);

    }
}
