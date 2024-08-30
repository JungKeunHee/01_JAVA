package com.ohgiraffers.section04.scanner;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //컴퓨터랑 가위(1) 바위(2) 보(3)
        System.out.print("가위(1) 바위(2) 보(3) 중에 (숫자)하나만 입력 : ");
        int choice = sc.nextInt();

        Random num1 = new Random();
        int choice2 = num1.nextInt(3) + 1;
        System.out.println("컴퓨터가 낸 값은? : " + choice2);

        String vs = choice > choice2 ? "win" : "lose";


        System.out.println("결과는 ? " + vs);




    }
}
