package com.ohgiraffers.Test;

import java.util.Scanner;

public class Application9 {
    public static void main(String[] args) {
        /* 문자열을 하나 입력 받고,
         * 검색할 문자형을 하나 입력 받아
         * 입력받은 문자열에 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요.
         *
         * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
         * 검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 프로그램을 종료하세요.
         *
         * 또한 일치하는 문자의 경우 대소문자를 구분합니다.
         *
         * -- 프로그램 예시 --
         *
         * -- 정상 동작의 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : apple
         * 문자 입력 : p
         *
         * -- 출력 예시 --
         * 포함된 갯수 : 1개
         *
         * --------------------
         * -- 영문자가 아닌 문자 포함된 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : app2le
         *
         * -- 출력 예시 --
         * 영문자가 아닌 문자가 포함되어 있습니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch < 'Z') || (ch > 'a' && ch < 'z')) {
                System.out.println("영문자가 아닌 다른 문자가 들어있습니다");
                return;
            } else {

                System.out.print("문자 입력 : ");
                char ch2 = sc.next().charAt(0);

                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    char ch3 = str.charAt(j);
                    if (ch2 == ch3) {
                        count++;
                        System.out.println("문자로 입력하신 단어와 일치하는 갯수는 " + count + "개 입니다");
                    }
                }
            }
        }
    }
}



