package com.company;

import java.util.Scanner;

public class NeToChisloException extends Exception{
    public NeToChisloException(Integer i){
        if (i<0||i>3){
            throw new IllegalArgumentException(String.format("%s нет такого варианта", i));
        }
    }


}
