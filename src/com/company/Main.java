package com.company;

public class Main {

    public static void main(String[] args) {

        new Runner("Runner").start();
    }
}

//  Изначально писал через try и catch
//        try {
//        sleep(500);
//        } catch (Exception ignored) {
//        }
//        System.out.println(getName() + " бежит к " + runnerF.getName());
//        try {
//        sleep(500);
//  Но что то пошло не так...
