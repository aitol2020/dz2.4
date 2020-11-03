package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner1", new Runner("Runner2", new Runner("Runner3",
                new Runner("Runner4", new Runner("Runner5", new Runner("Runner4",
                        new Runner("Runner3", new Runner("Runner2", new Runner("Runner1")))))))));
        runner1.start();
    }

}
