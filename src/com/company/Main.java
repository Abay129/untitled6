package com.company;

public class Main {
    private static Integer wons = 0;
    private static Integer loses = 0;
    private static Integer ties = 0;

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        sravnit(player, computer);
    }


    public static void sravnit(Player player, Computer computer) {
        player.getZnacheniye();
        computer.getZnazheniye();
        if (player.znacheniye == Vybor.ROCK) {
            if (computer.znacheniye == Vybor.PAPER) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            } else if (computer.znacheniye == Vybor.ROCK) {
                System.out.println("Ничья");
                ties = ties + 1;
            } else if (computer.znacheniye == Vybor.SCISSORS) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;
            }
        } else if (player.znacheniye == Vybor.SCISSORS) {
            if (computer.znacheniye == Vybor.PAPER) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;
            } else if (computer.znacheniye == Vybor.ROCK) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            } else if (computer.znacheniye == Vybor.SCISSORS) {
                System.out.println("Ничья");
                ties = ties + 1;
            }
        } else if (player.znacheniye == Vybor.PAPER) {
            if (computer.znacheniye == Vybor.PAPER) {
                System.out.println("Ничья");
                ties = ties + 1;

            } else if (computer.znacheniye == Vybor.ROCK) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;

            } else if (computer.znacheniye == Vybor.SCISSORS) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            }

        }
    }





}
