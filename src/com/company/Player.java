package com.company;

import java.util.Scanner;

public class Player {
    public Vybor znacheniye;


    public Player(){

    }

    public Vybor getZnacheniye() {
        System.out.println("что вы хотите поставить");
        System.out.println("1 - камень, 2 - ножницы, 3 - бумага");
        Scanner scanner = new Scanner(System.in);
        Integer user = scanner.nextInt();
        if (user == 1){
            znacheniye = Vybor.ROCK;
        }else if (user == 2){
            znacheniye = Vybor.SCISSORS;

        }else if (user == 3){
            znacheniye = Vybor.PAPER;

        }
        return znacheniye;
    }
}
