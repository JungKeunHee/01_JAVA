package com.ohgiraffers.section01.polymorphism;

public class 개구리 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("개구리가 식탁에 앉아 햄버거를 낼름낼름");
    }

    @Override
    public void 뛰기() {
        System.out.println("개구리가 뛰고 있습니다");
    }

    @Override
    public void 울부짖기() {
        System.out.println("개애ㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐ구우ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㄹ");
    }

    /* comment. 자식은 부모의 메소드 재정의 뿐 아니라 본인의 기능도 가질 수 있다. */
    public void 낼름공격(){
        System.out.println("개구리가 혓바닥으로 쌔게 내려칩니다");
    }

}
