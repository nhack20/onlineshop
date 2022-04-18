package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("PRESS [1] TO ADD CLIENTS");
            System.out.println("PRESS [2] TO LIST CLIENTS");
            System.out.println("PRESS [3] TO DELETE ORDERS");
            System.out.println("PRESS [4] TO GET TOTAL ANALYTICS ON PLAYERS PRICE");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name");
                String name = in.next();

                System.out.println("Insert phone");
                int phone = in.nextInt();

                System.out.println("Insert price");
                int price = in.nextInt();

                Client pl = new Client(name, phone, price);
                ArrayList<Client> clients = readClients();
                clients.add(pl);
                saveClients(clients);

            }else if(choice.equals("2")){

                ArrayList<Client> clients = readClients();
                for (int i = 0; i<clients.size(); i++) {
                    System.out.println((i+1) + ") "+clients.get(i));
                }

            }else if (choice.equals("3")){

                ArrayList<Client> clients = readClients();
                for (int i = 0; i<clients.size(); i++) {
                    System.out.println((i+1) + ") "+clients.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
                }

                System.out.println("Insert index of clients to delete: ");
                int index = in.nextInt(); //Вводим порядковый номер игрока из списка от 1 до размера
                clients.remove(index-1);

                saveClients(clients);

            }else if(choice.equals("4")){

                int sum = 0;
                //Получаем актуальные данные
                ArrayList<Client> clients = readClients();
                for (Client p: clients){
                    sum+=p.getPrice();
                }
                System.out.println("The total cost of services the clients "+sum);

            }else if (choice.equals("0")){

                System.exit(0); // Выход из программы

            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static void saveClients(ArrayList<Client> clients){
        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("clients.txt"));
            //Цикл foreach. Добавим в конце \n. Каждый параметр будет записан в каждой строке.
            for (Client p : clients) {
                bw.write(p.getName()+"\n");
                bw.write(p.getPhone()+"\n");
                bw.write(p.getPrice()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Создадим метод который не просто будет считывать, а будет полностью конвертировать данные обратно в ArrayList<Player>
    public static ArrayList<Client> readClients(){
        ArrayList<Client> players = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("clients.txt"));
            String line = "";
            while((line = br.readLine())!=null){

                int phone = Integer.parseInt(br.readLine());
                int price = Integer.parseInt(br.readLine());
                players.add(new Client(line, phone, price)); //Заново создаем новый объект игрока и добавляем в массив

            }
        }catch (Exception e){

        }
        return players;
    }
}