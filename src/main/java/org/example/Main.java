package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab5();
    }

    public static void lab5() {
        String[] products = {"Хлеб", "Яблоки", "Молоко", "Мясо", "Помидоры"};
        int[] prices = {30, 25, 60, 200, 120};

        System.out.println("Товары:");

        for (int i = 0; i < products.length; i++) {
            System.out.println("1. " + (i + 1) + " " + products[i] + " Цена/шт: " + prices[i] + " руб");
        }



        String[] bag = new String[products.length];

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int totalPrice = 0;

        try {
            while (true) {
                int amount = 0;
                int productNumber = 0;

                System.out.println("Введите номер товара и количество или end для завершения программы");

                String ProductNumLine = in.nextLine();
                if (ProductNumLine.equals("end")){
                    System.out.println("Программа завершилась!!!");
                    break;
                }
                productNumber += Integer.parseInt(ProductNumLine)-1;

                String amountLine = in.nextLine();

                amount += Integer.parseInt(amountLine)-1;

                if (amount <= 0) {
                    bag[counter] += "";
                }

                bag[counter] = "Товар: " + products[productNumber] + " Количество: " + amount + " Цена: " + (prices[productNumber]) * amount + " Рублей";

                System.out.println("Товаров в корзине: " + (counter + 1));

                totalPrice += TotalPrice(prices, productNumber, amount);

                counter++;
            }
        } finally {
            if (bag[0] != null) {
                System.out.println("Корзина:");
                for (int j = 0; j < bag.length; j++) {
                    if (bag[j] != null) {
                        System.out.println(bag[j]);
                    }
                }
                System.out.println("Стоимость всех товаров: " + totalPrice + " Рублей");

            } else {
                System.out.println("Корзина пустая");
            }
        }


    }

    public static int TotalPrice(int[] prices, int productNumber, int amount ){
       int totalPrice = (prices[productNumber]) * amount;
       return totalPrice;
    }
}