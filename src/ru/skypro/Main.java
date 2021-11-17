package ru.skypro;

public class Main {

    public static void main(String[] args) {

       byte weightBanana = 80;
       byte weightMilk = 105;
       byte weightIceCream = 100;
       byte weightEgg = 70;

       int shaker = 5 * weightBanana + 2 * weightMilk + 2 * weightIceCream + 4 * weightEgg;
       float shakerKg= shaker / 1000f;

       System.out.println("Вес завтрака "+shaker+ " грамм");
       System.out.println("Вес завтрака " + shakerKg + " килограмм" );

    }
}
