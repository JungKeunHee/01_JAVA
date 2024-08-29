package com.ohgiraffers.section01.method;

public class Test {
    public static void main(String[] args) {

        int A;
        int B;

        A = 2;
        B = 6;

        String C = (A >= 8) ? "출발 확정" : "출발 보류";
        String D = (B >= 4) ? "출발 확정" : "출발 보류";

        System.out.println("A 패키지 : " + A + " 출발 : " + C);
        System.out.println("B 패키지 : " + B + " 출발 : " + D);

        int sum = A + B;

        String E = (sum >= 8) ? "출발 확정" : "출발 보류";

        System.out.println("기준 미달이였지만 합산한 결과 : " + E);


    }

}
