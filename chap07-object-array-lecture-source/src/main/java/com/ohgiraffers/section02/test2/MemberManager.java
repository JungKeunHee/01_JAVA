package com.ohgiraffers.section02.test2;

import java.util.Scanner;

public class MemberManager {

    public void sighUp() {
        Scanner sc = new Scanner(System.in);

        System.out.print("회원 번호 입력 : ");
        String no = sc.nextLine();
        System.out.print("회원 아이디 입력 : ");
        String id = sc.nextLine();
        System.out.print("회원 패스워드 입력 : ");
        String pwd = sc.nextLine();
        System.out.print("회원 이름 입력 : ");
        String name = sc.nextLine();

        MemberDTO memberDTO = new MemberDTO(no, id, pwd, name);

        MemberSave member = new MemberSave();
        member.save(no, id, pwd, name);

        System.out.println("현재 " + memberDTO.toString() + " 저장되어 있습니다");

    }

    public void search(){


        MemberSave save = new MemberSave();


    }

}

