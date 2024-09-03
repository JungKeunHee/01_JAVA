package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test2 {
    public void pyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("만들고 싶은 삼각형의 층 수를 입력하시오 : ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            System.out.println();
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
        }
    }
}

