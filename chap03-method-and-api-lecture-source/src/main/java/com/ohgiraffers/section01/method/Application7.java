package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* title. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해할 수 있다. */

        /* comment.
        *   매개변수와 리턴값 복합 응용
        *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용해서
        *   간단한 계산기 만들어보기
        *  */

        /* comment.
            더하기 메소드, 빼기 메소드, 곱하기 메소드, 나누기 메소드
            해당하는 메소드 들에게 2개의 정수를 넘겨줄 것이다.
            */

        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        app7.plusTwoNumbers(first, second);
        
        int A = app7.plusTwoNumbers(first, second);
        System.out.println("더하기 = " + A);

        app7.minusTwoNumbers(first, second);
        int B = app7.minusTwoNumbers(first, second);
        System.out.println("빼기 = " + B);

        app7.minusTwoNumbers(first, second);
        int C = app7.multiplyTwoNumbers(first, second);
        System.out.println("곱셈 = " + C);

        app7.divideTwoNumbers(first, second);
        int D = app7.divideTwoNumbers(first, second);
        System.out.println("나눗셈 = " + D);

    }

    public int plusTwoNumbers(int a, int b) {
        return a + b;
    }

    public int minusTwoNumbers(int a, int b) {
        return a - b;
    }

    public int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public int divideTwoNumbers(int a, int b) {
        return a / b;
    }

}
