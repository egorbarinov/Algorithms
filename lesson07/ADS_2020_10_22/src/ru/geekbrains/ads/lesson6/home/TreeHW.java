package ru.geekbrains.ads.lesson6.home;

import ru.geekbrains.ads.lesson6.Tree;
import ru.geekbrains.ads.lesson6.TreeImpl;

import java.util.Random;

public class TreeHW {

    public static void main(String[] args) {
        Random random = new Random();
        int treeScore = 100;
        int maxValue = 6;
        int nodeNumber = (int) (Math.pow(2, maxValue) - 1);
        int maxNumber = 25;//

        int balanced = 0;

        for (int i = 0; i < treeScore; i++) {
            Tree<Integer> tree = new TreeImpl<>(maxValue);
            creationTree(random, nodeNumber, maxNumber, tree);
            if (tree.isBalanced()) {
                balanced++;
                tree.display();
            }

        }
        System.out.println("Количество сбалансированных деревьев= " + ((balanced / (treeScore * 1.0)) * 100) + "%");
    }

    private static void creationTree(Random random, int nodeNumber, int maxNumber, Tree<Integer> theTree) {
        for (int j = 0; j < nodeNumber; j++) {
            theTree.add(random.nextInt(maxNumber * 2 + 1) - maxNumber);
        }
    }

}