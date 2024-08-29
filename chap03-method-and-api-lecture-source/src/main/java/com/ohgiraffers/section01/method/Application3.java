package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* title. 메소드의 전달 인자와 매개변수에 대해 이해하고 활용할 수 있다. */

        /* comment
        *   전달인자(argument) 와 매개변수(parameter) 를 이용한 메소드 호출
        *   지금까지 우리가 배운, 즉 사용한 변수는 지역변수에 해당한다.
        * */

        /* comment.
        *   변수의 종류
        *   1. 지역변수
        *   2. 매개변수
        *   3. 전역변수
        *   4. 클래스(static) 변수
        *  */

        /* comment.
        *   지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        *   이것은 지역변수의 스코프(범위)라고 한다.
        *   이제 만약 다른 메소드들 끼리 값을 공유해야 하는 경우가 생기는 경우
        *   메소드 호출 시에 사용하는 괄호 ex) methodA() 를 이용해서 값을
        *   전달할 수 있다.
        *   이 때 전달하는 값을 전달인자(argument) 라고 부르고,
        *   메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        *   매개변수(parameter) 라고 부른다.
        *  */

        /* index. 2. 만든 메소드 호출해보기 */

        Application3 A = new Application3();
        A.testMethod(40);


    }

    public void testMethod(int test) {

        /* index. 1. 호출할 메소드 만들기 */

        System.out.println("testMethod 호출됨...");
        System.out.println("제 나이는 " + test + "세 입니다");
        System.out.println("TestMethod 종료됨...");
    }

}
