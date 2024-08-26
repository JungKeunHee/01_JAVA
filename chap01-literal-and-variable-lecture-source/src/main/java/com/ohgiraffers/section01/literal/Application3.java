package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {
     /* 수업목표 문자열 합치기 결과를 예측해서 사용할 수 있다. */

     /* 세 개의 문자열 합치기*/
        System.out.println("=============세 개의 문자열 합치기=============");
        // 정수 9, 정수 9, 문자열 "9"를 가지고

        //결과값 : 189
        System.out.println(9 + 9 + "9");

        //결과값 : 999
        System.out.println("9" + 9 + 9);
        // + 연산 결과는 항상 왼쪽에서 오른쪽이다.

        // 결과값 : 918
        System.out.println("9" + (9 + 9));

        /* 10과 20의 사칙연산 결과 */
        System.out.println("=============보기 안 좋은 10과 20의 연산 결과=============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("=============보기 좋은 10과 20의 연산 결과=============");
        System.out.println("10과 20의 합 결과 : " + (10 + 20));
        System.out.println("10과 20의 차 결과 : " + (10 - 20));
        System.out.println("10과 20의 곱 결과 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 결과 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 결과 : " + (10 % 20));
    }
}
