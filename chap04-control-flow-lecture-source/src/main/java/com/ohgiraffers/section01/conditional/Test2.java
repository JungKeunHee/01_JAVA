package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test2 {

    public void test () {

        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게 입력하기 : ");
        int a = sc.nextInt();

        if (a >= 70) {
            System.out.println("샐러드를 먹으세요");

        } else if (a < 70) {
            sc.nextLine();
            System.out.print("치킨집이 열었나요? yes(1) or no(2) : ");
            int b = sc.nextInt();

            if (b == 1)
                System.out.println("치킨집이 열었으니 치킨을 먹자");

            else if (b == 2) {
                System.out.println("치킨집은 닫았으니 라면을 먹자");
            }
        }
    }
}
