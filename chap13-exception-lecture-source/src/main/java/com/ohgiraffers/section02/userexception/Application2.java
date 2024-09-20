package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest2 et = new ExceptionTest2();

        try {
            // 상품 가격 음수
//            et.checkEnoughMoney(-3000, 5000);

            // 가진 돈 음수
//            et.checkEnoughMoney(3000, -5000);

            // 가진 돈이 상품가격보다 적을 경우
            et.checkEnoughMoney(3000, 1000);

//            et.checkEnoughMoney(-3000, 5000);

            /* title.
            *   주의사항
            *   catch 블럭은 위에서부터 아래로 자신의 타입과 맞는
            *   경우 동작을 하게 되는데, 상위타입(NegativeException) 이
            *   catch 블럭 상단에 위치하게 된다면
            *   하단에 작성한 하위타입(MoneyNegativeException) 은
            *   절대 도달할 수 없는 코드가 되기 때문에 컴파일 에러를 발생한다.
            *  */

        // 예외 상황 별 catch 블럭을 따로 작성해서 처리할 수 있다.
        } catch (PriceNegativeException e) {
            System.out.println("상품가격이 음수상황 발생!!!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {
            System.out.println("가진 돈이 음수상황 발생!!!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {
            System.out.println("돈이 충분하지 않는 상황 발생!!!");

            System.out.println(e.getMessage());


            // finally 구문 : 예외발생 여부와 상관없이 실행할 내용
            /* comment.
            *   finally 구문은 나중에 다시 다루겠지만,
            *   사용한 자원을 닫는 곳에 많이 쓴다.
            *  */
        } finally {
            System.out.println("finally 블럭 예외 상관 없이 동작 확인...");


        }

        System.out.println("프로그램을 종료합니다...");

    }

}
