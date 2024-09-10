package com.ohgiraffers.section02.test;

public class MemberInsert {
    public void insert(MemberDTO[] members) {
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을 등록하였습니다");
        }
    }
}
