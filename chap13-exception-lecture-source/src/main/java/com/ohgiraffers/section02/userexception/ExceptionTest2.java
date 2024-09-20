package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest2 {


    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        // 상품가격이 음수라면?
        if (price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없다.");
        }

        // 가진 돈이 음수라면?
        if (money < 0 ){
            throw new MoneyNegativeException("가진 돈이 음수일 수 없다.");
        }

        // 가진 돈이 상품 가격보다 적다면?
        if (money < price){
            throw new NotEnoughMoneyException("가진 돈이 상품가격보다 적습니다.");

        }

        System.out.println("모든 조건 만족하시네요. 즐거운 쇼핑 하세요~~~!!!");


    }
}
