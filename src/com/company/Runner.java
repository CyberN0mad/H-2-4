package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1, b = 2; i < 6; i++, b++) {
            System.out.printf("%s берет палочку \n", Thread.currentThread().getName() + " " + i);
            if (b == 6) {
                System.out.printf("%s бежит к финишу \n", Thread.currentThread().getName() + " " + i);
                System.out.printf("%s бежит к Runner 4 \n", Thread.currentThread().getName() + " " + i);
            } else {
                System.out.printf("%s бежит к Runner %d \n", Thread.currentThread().getName() + " " + i, b);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
        for (int i = 4, j = 4; i >= 1; i--, j--) {
            System.out.printf("%s берет палочку \n", Thread.currentThread().getName() + " " + i);
            if (i == 1) {
                interrupt();
            }
            else {
                System.out.printf("%s бежит к Runner %d \n", Thread.currentThread().getName() + " " + i, j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
