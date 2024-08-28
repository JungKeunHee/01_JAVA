package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* title. 논리연산자의 우선순위에 대해 이해하고 활용해보자. */

        /* comment.
        *   논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11 순위
        *   || : 12 순위
        *  */

        /* index. 1. 1부터 100까지 사이의 값인지 확인 */
        int num1 = 160;
        System.out.println("num1 이 1부터 100 사이인 지 확인 : " + (num1 >= 1 && num1 <= 100));

        /* index. 2. 영어 대문자인지 확인 */
        char ch1 = 'G'; //문자는 내부적으로 숫자이다.
        System.out.println("ch1 : 영어 대문자인 지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        char ch3 = 'A';

        int ch4 = ch2;
        int ch5 = ch3;
        System.out.println(ch4);
        System.out.println(ch5);

        /* index3. 'f' 대소문자 상관 없이 영어인지 확인해보기 */
        // f는 a~z 이거나 A~Z 사이면 되지 않을까?
        char a = 'f';

        System.out.println("f가 대소문자 상관없이 영어인지 : " + ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')));

    }
}
