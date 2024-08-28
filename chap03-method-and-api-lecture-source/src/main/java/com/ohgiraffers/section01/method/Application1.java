package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* title. 메소드의 호출 흐름에 대해 이해할 수 있다. */
        /* comment.
        *   메소드 란?
        *   메소드(method)는 어떤 특정 작업을 수행하기 위한
        *   명령문(코드)의 집합.
        *  */

        System.out.println("main() 시작됨...");

        /* index. 2. 작성한 method() 호출하기. */
        /* comment.
        *   우리가 만든 메소드 호출하는 방법,
        *   표현식
        *   클래스명 변수명 = new 클래스명();
        *   변수명.메소드명();
        *  */

        /* comment.
        *   main 영역 밖에 있는 친구를 소환할 때 쓰는 구문
        *  */
        Application1 app1 = new Application1();

        app1.methodA();


        System.out.println("main() 종료됨...");



    }

    /* index. 1. methodA() 만들어보기 */

    public void methodA() {

        System.out.println("methodA() 등장...");

        methodB();

        System.out.println("methodA() 퇴장...");


    }

    /* index. 3. methodB() 만들어보기 */
    public void methodB() {

        System.out.println("methodB() 등장...");
        System.out.println("methodB() 퇴장...");

    }

}
