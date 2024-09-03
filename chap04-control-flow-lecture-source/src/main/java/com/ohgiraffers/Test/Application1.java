package com.ohgiraffers.Test;

public class Application1 {
    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요.
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */
        int sum = 0;
        for (int num = 1; num < 11; num++) {
                sum += num;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
