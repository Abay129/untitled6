package com.company;

import java.util.Random;

public class Computer {
    public Vybor znacheniye;
    public Computer(){

    }



    public Vybor getZnazheniye(){
        Random random = new Random();
        Integer i = random.nextInt(3);
        if (i == 0){
            znacheniye = Vybor.SCISSORS;
            System.out.println("Компьютер ставит ножницы");
        }else if (i == 1){
            znacheniye = Vybor.PAPER;
            System.out.println("Компьютер ставит бумагу");
        }else if (i == 2){
            znacheniye = Vybor.ROCK;
            System.out.println("Компьютер ставит камень");
        }
        return znacheniye;
    }
}

