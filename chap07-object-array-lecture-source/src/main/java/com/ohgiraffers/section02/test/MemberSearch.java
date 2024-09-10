package com.ohgiraffers.section02.test;

public class MemberSearch {
    public MemberDTO[] search() {

        return new MemberDTO[]{
                new MemberDTO(1, "user01", "pass01", "정근희1"),
                new MemberDTO(2, "user02", "pass02", "정근희2"),
                new MemberDTO(3, "user03", "pass03", "정근희3"),
        };

    }
}
