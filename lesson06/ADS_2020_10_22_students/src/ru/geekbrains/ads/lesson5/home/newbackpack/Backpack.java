package ru.geekbrains.ads.lesson5.home.newbackpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private final int maxWeight;

    private int bestPrice;
    private List<Item> bestItems = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private  int sumWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    private int sumPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }

    private void bestSet(List<Item> items) {
        int sumPrice = sumPrice(items);
        int sumWeight = sumWeight(items);
        if (sumWeight <= maxWeight && (bestItems == null || sumPrice > bestPrice)) {
            bestItems = items;
            bestPrice = sumPrice;
        }
    }

    public List<Item> getBestSet() {
        return bestItems;
    }

    public void collectBestSet(List<Item> items) {
        if (items.isEmpty()) {
            return;
        }

        bestSet(items);

        for (int i = 0; i < items.size(); i++) {
            List<Item> copiedItems = new ArrayList<>(items);
            copiedItems.remove(i);
            collectBestSet(copiedItems);
        }
    }

    public int getBestPrice() {
        return bestPrice;
    }
}
