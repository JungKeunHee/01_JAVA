package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* title. Scanner 사용 시 주의사항 */
        /* comment.
        *   스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서
        *   그래서 크게 2가지 사항을 주의해야 한다.
        *   1. next() 로 문자열을 입력 받은 후 정수, 실수, 논리값 입력 받을 때
        *   2. 정수, 실수, 논리값 입력 후 next() 로 문자열 입력 받을 때
        *  */

        /* index. 1. 스캐너 객체 생성 = 사용할 준비 */
        Scanner sc = new Scanner(System.in);

        /* index. 1-1. next() 로 문자열 입력 받은 후 정수 실수, 실수, 논리값 입력 */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.nextLine(); // 공백이나 개행문자 전 까지를 읽는다.
        System.out.println("str1 = " + str1);


        /* comment
        *   컴파일 에러가 발생하고 있지 않다 => 번역에는 문제가 없다
        *   hi만 입력을 하고 정수를 하면 정상적으로 동작을 한다.
        *   하지만, hi world 를 입력하게 되면 숫자를 입력하지 않았음에도
        *   InputMissmatch 오류가 발생하게 된다
        *   -> 공백이 있는 문자열을 입력해야 된다 = nextLine() 을 쓰면 된다.
        *   -> sc.nextLine(); 을 호출 중간에 넣어만 줘도 해결이 된다.
        * */

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /* index. 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 입력 받을 때 */

        System.out.print("다시 한 번 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        /* comment.
        *   입력을 받을 시 nextLine()을 호출한 것이 아직 행을 바꾸지 않고
        *   한 라인을 읽어드린다고 판단을 해서 아무것도 읽지 못 하고
        *   넘어간 뒤에 다음 출력 구문을 실행 한 것이다.
        *   이걸 해결하기 위해서는 sc.nextLine() 호출 전에 미리 sc.nextLine() 을
        *   한 번 호출하면
        *   그 행을 읽어드리는 걸 다음 행으로 넘기게 되고, 그 이후
        *   새로 입력 받을 한 라인을 읽어와서 str2에 저장하게 된다.
        *  */

        sc.nextLine();
        System.out.print("공백이 있는 문자열 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);

    }
}
