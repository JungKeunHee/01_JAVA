package com.ohgiraffers.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        while (true) {
            System.out.println("============회원등록 프로그램===========");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 조회");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (no) {
                case 1:
                    manager.signUpMember();
                    break;
                case 2:
                    manager.searchMember(); // 회원 조회 메서드 호출
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("메뉴 번호만 입력해주세요...");
            }
        }
    }
}