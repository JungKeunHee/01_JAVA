package com.ohgiraffers.test;

public class Application1 {

    public static void main(String[] args) {

        int a;
        int b;

        a = 20;
        b = 30;

        System.out.println("더하기 결과 : " + (a + b));
        System.out.println("빼기 결과 : " + (a - b));
        System.out.println("곱하기 결과 : " + (a * b));
        System.out.println("나누기한 몫 : " + (a / b));
        System.out.println("나누기한 나머지 : " + (a % b));

        double c = 12.5;
        double d = 34.5;

        double e = c * d;
        double f = c + c + d + d;

        System.out.println("면적 : " + e);
        System.out.println("둘레 : " + f);


    }
}
