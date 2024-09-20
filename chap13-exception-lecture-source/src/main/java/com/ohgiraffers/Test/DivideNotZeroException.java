package com.ohgiraffers.Test;

public class DivideNotZeroException extends Exception{

    public static void divideNotZeroException (int first, int second) {

        if (first == 0){
            System.out.println("첫 번째 정수 0 확인, 0으로 나눌 수 없습니다...");
            System.out.println("프로그램을 종료합니다...");
            System.exit(0);

        } else if (second == 0){
            System.out.println("두 번째 정수 0 확인, 0으로 나눌 수 없습니다...");
            System.out.println("프로그램을 종료합니다...");
            System.exit(0);
        }

    }
}
