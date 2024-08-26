package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

        //* 값의 형태에 따라서 사용할 수 있는 연산자의 종류와
        // 연산의 결과가 달라지게 된다.

        /* 목차 1. 숫자와 숫자의 연산 */
        /* 목차 1-1. 정수와 정수의 연산 */
        System.out.println("==============정수와 정수의 연산================");
        System.out.println(123 + 456);
        System.out.println(123 - 10);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);
        // 수학적으로 사용하는 사칙연산 추가적으로
        // 나머지 구하는 연산 %(mod연산자)를 사용할 수 있다

        /* 목차 1-2. 실수와 실수*/
        System.out.println("==============실수와 실수의 연산================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);

        /* 목차 2. 문자의 연산*/
        /* 목차 2-1. 문자와 문자의 연산*/
        /* 필기. 문자는 내부적으로 숫자로 변환되어 계산이 된다.*/
        System.out.println("==============문자와 문자의 연산================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 목차 2-2. 문자와 정수의 연산*/
        System.out.println("==============문자와 정수의 연산================");
        System.out.println('a' + 1);
        /*
        * 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식을 할 수 있기 때문에
        * 모든 문자는 대응이 되는 숫자들이 존재한다(아스키 코드와 유니코드)
        * */

        /* 목차 3. 문자열의 연산 */
        /* 목차 3-1. 문자열과 문자열의 연산 */
        System.out.println("==============문자열과 문자열의 연산================");
        // 문자열과 문자열의 '+' 연산 결과는 문자열 합치기가 된다
        // 문자열은 '+' 외에는 사용하지 못한다
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        /* 목차 3-2. 문자열과 다른 형태의 값 연산*/
        // 문자열이 포함된 연산은 '+'만 가능하다
        System.out.println("==============문자열과 다른 형태의 값 연산================");
        System.out.println("hello" + 123);
        System.out.println("hello" + 1.23);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);
        /* 중요.
        * 문자열이 포함된 연산의 결과는 다른 형태의 값(숫자, 문자, 논리)들도
        * 문자열로 취급을 하여 이어붙이기(즉 합치기) 결과가 나오게 된다
        *  */
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");

        /* 목차 4. 논리값과 문자열의 연산 */
        System.out.println("==============논리값과 문자열의 연산================");
//        System.out.println(true + 'a');
//        System.out.println(true + 1);
//        System.out.println(true + 1.23);
//        System.out.println(true + true);
        /* 논리 형태의 값은 문자열 더하기 연산 외에 전부 불가능하다 */
        System.out.println(true + "true");
    }
}
