package com.ohgiraffers.section02.test;

public class MemberManager {

    public void signUp (){

        MemberDTO[] members = new MemberDTO[3];

        members[0] = new MemberDTO(1, "user01", "pass01", "정근희1");
        members[1] = new MemberDTO(2, "user02", "pass02", "정근희2");
        members[2] = new MemberDTO(3, "user03", "pass03", "정근희3");

        MemberInsert insert = new MemberInsert();
        insert.insert(members);

    }

    public void search (){

        MemberSearch search = new MemberSearch();
        MemberDTO[] result = search.search();

        for (MemberDTO member : result){
            System.out.println(member.toString());
        }
        System.out.println(result.length + "명이 등록이 되어 있습니다");
    }

}
