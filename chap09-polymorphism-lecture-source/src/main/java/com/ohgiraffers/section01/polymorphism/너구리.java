package com.ohgiraffers.section01.polymorphism;

public class 너구리 extends 동물{
    @Override
    public void 먹기() {
        System.out.println("너구리가 너구리를 먹습니다");
    }

    @Override
    public void 뛰기() {
        System.out.println("너구리 저어엉ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ프ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }

    @Override
    public void 울부짖기() {
        System.out.println("아아ㅏ아아아아악!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void 깨물기(){
        System.out.println("너구리가 깨물기 스킬을 사용하였습니다.ㅋ");
    }
}
