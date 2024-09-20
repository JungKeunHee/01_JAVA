package com.ohgiraffers.section02.userexception;

public class Application1 {

    public static void main(String[] args)  {

        /* title. 사용자 정의의 예외클래스 정의 후 발생한 에외를 처리할 수 있다. */

        ExceptionTest2 et = new ExceptionTest2();

        try {
            // 상품 가격 음수
//            et.checkEnoughMoney(-3000, 5000);

            // 가진 돈 음수
//            et.checkEnoughMoney(3000, -5000);

            // 가진 돈이 상품가격보다 적을 경우
            et.checkEnoughMoney(3000, 1000);

//            et.checkEnoughMoney(-3000, 5000);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
