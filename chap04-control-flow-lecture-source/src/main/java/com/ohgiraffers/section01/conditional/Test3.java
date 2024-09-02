package com.ohgiraffers.section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

    public void randomUpperAlphabet (){

        Scanner sc = new Scanner(System.in);
        System.out.print("영어(대문자)를 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("출력하고 싶은 문자열의 길이수 입력 : ");
        int num = sc.nextInt();

        int a = str.charAt((int)Math.random() * num);

//        for (int i = num; i <= str.length(); )


//
//        String str2 = str.charAt(rand.nextInt(str.length())) * num;
//
//        System.out.println("출력된 결과 값 : " + str2);
    }
}
