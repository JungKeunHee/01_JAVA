package com.ohgiraffers.Test;

public class MultipleNotZeroException extends Exception  {

    public static void multipleNotZeroException(int first, int second){

        if (first == 0) {
            System.out.println("첫 번째 정수 0 확인, 0으로 곱할 수 없습니다...");
            System.out.println("시스템을 종료합니다...");
            System.exit(0);
        } else if (second == 0){
            System.out.println("두 번째 정수 0 확인, 0으로 곱할 수 없습니다...");
            System.out.println("시스템을 종료합니다...");
            System.exit(0);
        }
    }

}
