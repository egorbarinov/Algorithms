package ru.geekbrains.ads.lesson5.home.newbackpack;


import java.util.ArrayList;
import java.util.List;

public class TestBackpack {
    public static void main(String[] args) {
         List<Item> items = new ArrayList<>();
        items.add(new Item("Книга",   1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));

        Backpack backpack = new Backpack(5);
        backpack.collectBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Лучшая возможная цена " + backpack.getBestPrice());
    }

}
