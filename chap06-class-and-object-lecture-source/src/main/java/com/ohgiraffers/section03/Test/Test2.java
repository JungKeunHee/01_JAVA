package com.ohgiraffers.section03.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
    String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        for (int j = 0; j < i; j++) {

            if (ch == str.charAt(j)) {
                ch = ' ';
                }
            }
        System.out.print(ch + " ");
        }
    }
}


