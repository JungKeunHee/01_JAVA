package com.greedy.level02.normal;


import java.util.Random;
import java.util.Scanner;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }

    public String rockPaperScissors() {
        Random rand = new Random();
        int a = rand.nextInt(3) + 1;
        String b = (a == 1) ? "가위" : (a == 2) ? "바위" : "보";

        return b;
    }

    public String tossCoin() {
        Random tc = new Random();
        int a = tc.nextInt(2) + 1;
        String b = (a == 1) ? "앞면" : "뒷면";

        return b;
    }


//    public String randomUpperAlphabet(String upper, int len) {
//
//        int length = upper.length();
//
//        Random rand = new Random();
//        rand.nextInt(len);
//
//        return upper.charAt(rand.nextInt(len));
//
    }
