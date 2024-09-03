package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test3 {
    public void diamond(){

        Scanner sc = new Scanner(System.in);
        System.out.print("만들고 싶은 다이아몬드 층 수를 입력 : ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                if (height / 2 == 0){
                    System.out.print("*");
                }
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
