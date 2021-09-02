package com.company;

import java.util.Scanner;

public class Player {
    public Vybor znacheniye;


    public Player() {

    }

    public Vybor getZnacheniyeHard() {
        System.out.println("что вы хотите поставить");
        System.out.println("1 - камень, 2 - ножницы, 3 - бумага, 4- Ящерица, 5 - Спок");
        Scanner scanner = new Scanner(System.in);
        Integer user = scanner.nextInt();
        new NeToChisloEceptionHard(user);
        if (user == 1) {
            znacheniye = Vybor.ROCK;
        } else if (user == 2) {
            znacheniye = Vybor.SCISSORS;
        } else if (user == 3) {
            znacheniye = Vybor.PAPER;
        } else if (user == 4) {
            znacheniye = Vybor.LIZARD;
        } else if (user == 5) {
            znacheniye = Vybor.SPOK;
        }
        return znacheniye;
    }

    public Vybor getZnacheniye() {
        System.out.println("что вы хотите поставить");
        System.out.println("1 - камень, 2 - ножницы, 3 - бумага");
            Scanner scanner = new Scanner(System.in);
            Integer user = scanner.nextInt();
            new NeToChisloException(user);
            if (user == 1) {
                znacheniye = Vybor.ROCK;
            } else if (user == 2) {
                znacheniye = Vybor.SCISSORS;
            } else if (user == 3) {
                znacheniye = Vybor.PAPER;
            }
        return znacheniye;
    }
}
