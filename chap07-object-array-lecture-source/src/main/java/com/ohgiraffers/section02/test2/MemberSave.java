package com.ohgiraffers.section02.test2;

public class MemberSave {
    public void save(String no, String id, String pwd, String name) {

        String[] arr = {no, id, pwd, name};
        System.out.println(arr[3] + "님이 회원등록 되었습니다");
    }

//    public MemberDTO saveMember(String no, String id, String pwd, String name) {
//
//        String[] arr = {no, id, pwd, name};
//
//    }
}
