package com.ohgiraffers.section04.scanner;

import java.util.Random;

public class Test2 {

    public static void main(String[] args) {

        //로또번호 6개 랜덤 추천받기
        Random num = new Random();

        int A = num.nextInt(45) + 1;
        int B = num.nextInt(45) + 1;
        int C = num.nextInt(45) + 1;
        int D = num.nextInt(45) + 1;
        int E = num.nextInt(45) + 1;
        int F = num.nextInt(45) + 1;




//        System.out.println("로또 추첨 번호 : " + A + ", " + B + ", " + C + ", " + D + ", " + E + ", " + F);


    }
}
