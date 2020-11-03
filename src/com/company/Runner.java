package com.company;

public class Runner extends Thread {
    Runner runner;
        public Runner(String name, Runner runner) {
            super(name);
            this.runner = runner;
        }

        public Runner(String name) {
            super(name);
        }



        public void run(){
            if (runner != null){
                try {
                    sleep(1000);
                    runner.start();
                } catch (NullPointerException | InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.getName().equals("Runner5")) {
                    System.out.println("\n" + this.getName() + " Получает палку ");
                    System.out.println(this.getName() + " Драйвера в финише ");
                    System.out.println(this.getName() + " Драйверы для  " + runner.getName());
                } else {
                    System.out.println("\n" + this.getName() + " Получает палку ");
                    System.out.println(this.getName() + " Драйверы идет к  " + runner.getName());
                }

                if(runner.getName().equals("Runner1")){
                    System.out.println("\n" + runner.getName() + " Получает палку  ");
                    System.out.println(runner.getName() + " Драйверы в финише  ");
                }
            }
        }
    }

