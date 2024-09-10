package com.ohgiraffers.section02.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberManager members = new MemberManager();
        while(true){

            System.out.println("========회원등록 프로그램========");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();
            switch (no){
                case 1:
                    members.signUp();
                    break;
                case 2:
                    members.search();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴에 맞는 번호를 입력 해주세요!!!!");
            }


        }

    }
}
