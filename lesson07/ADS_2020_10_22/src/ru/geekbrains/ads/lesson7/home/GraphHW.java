package ru.geekbrains.ads.lesson7.home;

import ru.geekbrains.ads.lesson7.Graph;

import java.util.Stack;

public class GraphHW {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Тамбов");
        graph.addVertex("Москва");
        graph.addVertex("Липецк");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdges("Москва","Тула");
        graph.addEdges("Москва","Калуга");
        graph.addEdges("Москва","Рязань");
        graph.addEdges("Тула","Липецк");
        graph.addEdges("Рязань","Тамбов");
        graph.addEdges("Калуга","Орел");
        graph.addEdges("Липецк","Воронеж");
        graph.addEdges("Тамбов","Саратов");
        graph.addEdges("Орел","Курск");
        graph.addEdges("Саратов","Воронеж");
        graph.addEdges("Курск","Воронеж");

//        Stack<String> path = graph.findShortPathViaBfs("Москва", "Орел");
//        Stack<String> path = graph.findShortPathViaBfs("Москва", "Саратов");
//        Stack<String> path = graph.findShortPathViaBfs("Тамбов", "Рязань");
        Stack<String> path = graph.getShortPath("Рязань", "Курск");
        System.out.println("\n The shortest path:");
        display(path);
    }

    private static void display(Stack<String> path) {
        if (path.isEmpty()) {
            return;
        }
        while (true) {
            System.out.print(path.pop());
            if (!path.isEmpty()) {
                System.out.print(" --> ");
            } else break;
        }
    }




}