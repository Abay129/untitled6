package com.company;

public class NeToChisloEceptionHard extends Exception{
    public NeToChisloEceptionHard (Integer i){
        if (i<0||i>5){
            throw new IllegalArgumentException(String.format("%s нет такого варианта", i));
        }
    }

}
