package ru.geekbrains.ads.lesson2.homework;

public class Stopwatch {
    private final long start;

    public Stopwatch() {
        this.start = System.currentTimeMillis();
    }

    public double expendTime() {
        long now = System.currentTimeMillis();

        return (now - start) / 1000.0;
    }
}
