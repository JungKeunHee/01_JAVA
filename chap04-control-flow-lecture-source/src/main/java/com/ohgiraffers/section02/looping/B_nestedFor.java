package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanTwoToNine (){
        // 2에서 9단 까지의 구구단 모두 출력
        // 단수 -> 2 ~ 9
        // 수 -> 1 ~ 9
        for (int dan = 2; dan <= 9; dan++){
            System.out.println(dan + "단");
            for (int su = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            // 한 줄 띄우기
            System.out.println();
        }
    }

    // 1 ~ 3 챕터 복습 매개변수, 전달인자
    public void upgradeGugudanTwoToNine (){

        for (int dan = 2; dan <=9; dan++){
            printGugudanOf(dan); // 전달인자
            //한 줄 띄기
            System.out.println();
        }

    }

    private void printGugudanOf(int dan) { //int dan 매개변수(값을 전달 받을 변수)
        // 어떤 값을 전달 받는 지 확인하는 출력문
        System.out.println("dan = " + dan);

        for(int su = 1; su <= 9; su++){
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes(){

        /* comment.
        *   키보드로 정수를 입력 받아 해당 정수 만큼
        *   한 행에 "*" 을 5개씩 출력하는 구문
        *  */

        // 3
        // *****
        // *****
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력해주세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){

//            for (int j = 1; j <= 5; j++){
//                System.out.print("*");
//            }

            // 위에 for 문을 메소드 복습을 위해 호출 식으로 변경
            printStar(5);

            // 한 줄 띄우기
            System.out.println();
        }

    }

    private void printStar(int times) {

        for (int j = 1; j <= times; j++){
            System.out.print("*");
        }

    }

    public void printTriangleStars(){
        /* comment.
        *   키보드로 정수 하나 입력 받아 해당 정수 만큼 한 행에 "*" 을 행의 번호개씩 출력
        *   ex) 정수를 입력ㅎ해주세요 : 5
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        *  */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하고 싶은 정수를 입력 하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
                System.out.println();
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }

    }

    public void printReverseTriangleStars(){
        /* comment.
        *   ex) 정수를 입력해주세요 : 5
        *   *****
        *   ****
        *   ***
        *   **
        *   *
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("(리버스)출력하고 싶은 정수를 입력 하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = row; j >= i; j--){
                System.out.print("*");
            }
        }
    }

}

