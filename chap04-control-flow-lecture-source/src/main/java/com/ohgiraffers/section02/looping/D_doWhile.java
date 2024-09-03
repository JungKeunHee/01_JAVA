package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void testDoWhileStatement(){

        /* title. do-while 문 단독 사용에 대해 이해할 수 있다. */

        /* comment.
        *   [do-while 문 표현식]
        *   초기식;
        *   do {
        *       1회차에는 무조건 실행하고, 이 후는 조건식을 확인해서
        *       조건을 만족하는 경우에만 반복할 구문
        *       증감식;
        *   } while(조건식)
        * */

        do {
            System.out.println("최초 한 번 동작함");
        } while (false);

        System.out.println("반복문 종료확인");

    }

    public void doWhileExample () {
        /* index.
        *   스캐너로 문자열을 입력 받아
        *   반복적으로 출력할 것이다.
        *   단, exit 가 입력이 되면 반복문을 종료
        *  */

        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("문자열을 입력해주세요 : ");
            str = sc.nextLine();
            System.out.println("str = " + str);
            /* comment.
            *   문자열은 == 비교가 불가능하다.
            *   그러면 어떻게 비교할까
            *   equlas() : 문자열이 같은 지 비교해주는 메소드
            *  */
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다");



    }

}
