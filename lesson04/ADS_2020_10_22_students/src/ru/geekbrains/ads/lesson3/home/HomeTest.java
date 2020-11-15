package ru.geekbrains.ads.lesson3.home;

import ru.geekbrains.ads.lesson3.home.deque.Deque;
import ru.geekbrains.ads.lesson3.home.deque.DequeImpl;
import ru.geekbrains.ads.lesson3.myqueue.PriorityQueue;
import ru.geekbrains.ads.lesson3.myqueue.Queue;
import ru.geekbrains.ads.lesson3.myqueue.QueueImpl;
import ru.geekbrains.ads.lesson3.mystack.Stack;
import ru.geekbrains.ads.lesson3.mystack.StackImpl;

public class HomeTest {

    public static final int MAX_SIZE = 10;

    public static void main(String[] args) {

        // 1. test stack, queue, priorityQueue
        Stack<Integer> stack = new StackImpl<>(MAX_SIZE);
        Queue<Integer> queue = new QueueImpl<>(MAX_SIZE);
        Queue<Integer> priorityQueue = new PriorityQueue<>(MAX_SIZE);

        for (int i = 0; i < MAX_SIZE ; i++) {
            stack.push(i+1);
            queue.insert(i+1);
            priorityQueue.insert((int) (Math.random() * 10));

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 10 9 8 7 6 5 4 3 2 1
        }
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " "); // 1 2 3 4 5 6 7 8 9 10
        }
        System.out.println();

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.remove() + " "); //2 4 4 4 5 6 6 7 8 9
        }
        System.out.println();

        // 2.Создать программу, которая переворачивает вводимые строки (читает справа налево).
        String text = "Весьма порой мешает мне заснуть\n" +
                "Волнующая, как ни поверни,\n" +
                "Открывшаяся мне внезапно суть\n" +
                "Какой-нибудь немыслимой фигни.";
        Stack<Character> characterStack = new StackImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            characterStack.push(text.charAt(i));
        }
        while (!characterStack.isEmpty()) {
            System.out.print(characterStack.pop());

        }
        System.out.println();

        // 3.Создать класс для реализации дека.
        Deque<Integer> deque = new DequeImpl<>(MAX_SIZE);
        // вставка справа:
        for (int i = 0; i < MAX_SIZE/2; i++) { // вставляем справа 12345
            deque.insertRight(i+1);
            System.out.print(deque.peekLast());// 12345
        }
        System.out.println();

        // вставка слева
        for (int i = MAX_SIZE; i > MAX_SIZE/2 ; i--) {
            deque.insertLeft(i);
            System.out.print(deque.peekHead());// 109876
        }
        System.out.println();

        for (int i = 0; i < MAX_SIZE; i++) {
//            System.out.print(deque.removeLeft()); // ожидаем увидить выходной результат 67891012345
            System.out.print(deque.removeRight()); // ожидаем увидить выходной результат 54321109876
        }

    }

}
