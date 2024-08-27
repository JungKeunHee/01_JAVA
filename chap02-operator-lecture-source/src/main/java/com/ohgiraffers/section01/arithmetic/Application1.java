package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args) {

        /* title. 산술연산자에 대해 이해하고 사용할 수 있다. */

        /* comment.
        *   산술연산자
        *   산술연산자는 주로 사칙연산과 관련된 연산자로
        *   가장 기본적이면서 많이 사용되는 연산자이다.
        *   피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        *  */

        /* comment.
        *   산술 연산자의 우선순위
        *   수학의 개념과 유사하게 곱하기, 나누기, 연산이 덧셈 뺄셈보다
        *   우선적으로 동작한다.
        *   ex) 2 + 3 * 4 = 14
        *  */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

    }
}
