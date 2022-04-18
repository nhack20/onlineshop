package com.company;

public class ManServices extends Tatooing implements MensHair,RoyalShaving,Shavingbeard{


    @Override
    public void menshaircut(int price, int quantity) {
        int total=0;
        price=4000;
        System.out.println(total=price*quantity);
    }

    @Override
    public void hairwashing(int price, int quantity) {
        int total=0;
        price=10000;
        System.out.println(total=price*quantity);
    }

    @Override
    public int shaving(int price, int quantity) {
        int total=0;
        price=15000;
        return total=price*quantity;
    }

    @Override
    public int beards(int price, int quantity) {
        int total=0;
        price=2000;
        return total=price*quantity;
    }

    @Override
    public void tato(int price, int quantity) {
        int total=0;
        price=140000;
        System.out.println(total=price*quantity);
    }
}



