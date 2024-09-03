package com.ohgiraffers.Test;

import java.util.Scanner;

public class Application10 {
    public static void main(String[] args) {
        /* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
         * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
         *
         * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
         * 또한 공백문자는 변경되지 않습니다.
         *
         * 문자열 1개를 입력 받고,
         * 얼만큼 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
         * 암호문을 작성하는 프로그램을 만들어 보세요.
         * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자이기 때문입니다.)
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : a B z
         * 숫자를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * e F d
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : a B z
         * 숫자를 입력하세요 : 27
         *
         * -- 출력 예시 --
         * b C a
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int ch = str.charAt(i - 1); // 문자열에서 charAt으로 한 문자씩 뽑아내어 각 문자에 대한 아스키 코드 확인
                int result = ch + num; // 각각의 아스키 코드에서 루프할 때마다 정숫값을 더해주기 ex) abc를 입력 후 정숫값 3입력 -> 979899으로 변환 -> 97+3 98+3 99+3
                System.out.print((char)result); // ex) 원래라면 정수값으로 100 101 102를 출력하게 되지만 이것을 다시 char로 형태변환을 해주면 정숫값만큼 밀리듯이 edf로 출력됨
            }

        }
    }

