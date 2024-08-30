package com.greedy.level02.normal;


import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }

    public String rockPaperScissors(){
        Random rand = new Random();
        int a = rand.nextInt(3) + 1;
        String b = (a == 1) ? "가위" : (a == 2) ? "바위" : "보";

        return b;
    }
}

