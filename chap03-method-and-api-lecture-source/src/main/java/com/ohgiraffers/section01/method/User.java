package com.ohgiraffers.section01.method;

public class User {

//    현승이는 User(클래스)에서 현재 통장의 총액을 출력 받고 싶어 합니다.
//
//    현승이의 월급은 300인데 월세 60, 통신비 5, 보험료 15를 납부하고 보너스로 20을 받았습니다.
//
//    그런데 현승이는 은행 이벤트에 당첨되어 현재까지 있던 통장 잔액이 1.1배가 되었습니다.
//
//            (통장 잔액의 시작은 0입니다.)
//
//    현재 현승이의 통장 잔액은 얼마인가요?
//
//    통장 잔액을 출력 받을 수 있는 코드를 작성해주세요.
//
//    클래스 : User, Account
//
//    User 클래스에는 계산 메서드가 없습니다.
//
//    계산 메서드는 Account에 있습니다.
//
//    원하는 출력 형태:
//
//    현재 현승이의 통장 잔액은 *****원 입니다.

    public static void main(String[] args) {
        int a = 0;

        Account AA = new Account();
        AA.money(a);

        int total = (int)AA.money(a);

        System.out.println("현재 현승이의 통장 잔액은 " + total     + "원 입니다." );

    }
}
