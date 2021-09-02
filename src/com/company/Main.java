package com.company;

public class Main {
    private static Integer wons = 0;
    private static Integer loses = 0;
    private static Integer ties = 0;

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        for (int p = 0; p <6; p++){
            sravnit(player, computer);
        }
        print();
    }

    public static void print(){
        Integer total = wons + loses + ties;
        double percant = 100.0 / total * wons;
        System.out.println("|Wons  | Loses | Ties  | Percant of wins    ");
        System.out.println(String.format("| %d   |  %d    |  %d    | %f      ", wons, loses ,ties, percant));
    }


    public static void sravnit(Player player, Computer computer) {
        player.getZnacheniye();
        computer.getZnazheniye();
        if (player.znacheniye == Vybor.ROCK) {
            if (computer.znacheniye == Vybor.PAPER || computer.znacheniye == Vybor.SPOK) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            } else if (computer.znacheniye == Vybor.ROCK) {
                System.out.println("Ничья");
                ties = ties + 1;
            } else if (computer.znacheniye == Vybor.SCISSORS || computer.znacheniye == Vybor.LIZARD ) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;
            }
        } else if (player.znacheniye == Vybor.SCISSORS) {
            if (computer.znacheniye == Vybor.PAPER || computer.znacheniye == Vybor.LIZARD) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;
            } else if (computer.znacheniye == Vybor.ROCK || computer.znacheniye == Vybor.SPOK) {
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

            } else if (computer.znacheniye == Vybor.ROCK || computer.znacheniye == Vybor.SPOK) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;

            } else if (computer.znacheniye == Vybor.SCISSORS || computer.znacheniye == Vybor.LIZARD) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            }

        }else if (player.znacheniye == Vybor.SPOK){
            if (computer.znacheniye == Vybor.SPOK) {
                System.out.println("Ничья");
                ties = ties + 1;

            } else if (computer.znacheniye == Vybor.ROCK || computer.znacheniye == Vybor.SCISSORS) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;

            } else if (computer.znacheniye == Vybor.PAPER || computer.znacheniye == Vybor.LIZARD) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            }


        }else if(player.znacheniye == Vybor.LIZARD){
            if (computer.znacheniye == Vybor.LIZARD) {
                System.out.println("Ничья");
                ties = ties + 1;

            } else if (computer.znacheniye == Vybor.PAPER || computer.znacheniye == Vybor.SPOK) {
                System.out.println("Вы побеждаете");
                wons = wons + 1;

            } else if (computer.znacheniye == Vybor.SCISSORS || computer.znacheniye == Vybor.ROCK) {
                System.out.println("Компьютер побеждает");
                loses = loses + 1;
            }

        }

    }





}
