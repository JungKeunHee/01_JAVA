package com.ohgiraffers.Test;

import java.util.Scanner;

public class Application11 {
    public static void main(String[] args) {

        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요.
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        // 금액 입력
        // 금액 입력

        Scanner sc = new Scanner(System.in);
        System.out.print("받은 금액을 입력 : ");// 받은 금액 입력
        int money = sc.nextInt();

        System.out.print("상품 가격을 입력 : ");// 상품 가격 입력
        int product = sc.nextInt();

        int minus = money - product; // 거스름 돈
        System.out.println("거스름 돈 : " + minus);

        String str [] = {"50000원권 지폐", "10000원권 지폐", "5000원권 지폐", "1000원권 지폐", "500원 동전", "100원 동전", "50원 동전", "10원 동전"};

        for (int i = 0; i < str.length; i++) {

        }

    }

}




