package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        /* title. try-catch 블럭을 이용하여 예외처리를 할 수 있다. */

        /* index. 2. try-catch 블럭을 이용한 방법(예외 발생) */

        ExceptionTest et = new ExceptionTest();

        try {
            // 상품의 가격을 더 높게 만들 것이다.
            et.checkEnoughMoney(50000, 30000);

            System.out.println("==========상품 구입 가능============");

        } catch (Exception e) {
            System.out.println("===========상품 구입 불가능=========");
        }

            System.out.println("프로그램을 종료 합니다...");
    }

}
