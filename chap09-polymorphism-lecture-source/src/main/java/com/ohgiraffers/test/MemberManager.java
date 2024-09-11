package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManager {

    Scanner sc = new Scanner(System.in);
    List<MemberDTO> memberList = new ArrayList<>(); // 회원 정보를 저장할 리스트

    public void signUpMember() {
        System.out.print("회원이름 입력 : ");
        String name = sc.nextLine();

        System.out.print("회원 아이디 입력 : ");
        String id = sc.nextLine();

        System.out.print("회원 비밀번호 입력 : ");
        String pwd = sc.nextLine();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName(name);
        memberDTO.setId(id);
        memberDTO.setPwd(pwd);

        memberList.add(memberDTO); // 리스트에 회원 정보 추가

        System.out.println(name + "님이 등록되었습니다");

        System.out.print("추가 등록을 원하시면 1번, 현재 회원 목록 확인은 2번 입력 : ");
        int no = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        switch (no) {
            case 1:
                signUpMember();
                break;
            case 2:
                searchMember();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

    public void searchMember() {
        if (memberList.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for (MemberDTO member : memberList) {
                System.out.println(member.toString());
            }
        }
    }
}