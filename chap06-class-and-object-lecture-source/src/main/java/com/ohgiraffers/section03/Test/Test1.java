package com.ohgiraffers.section03.Test;

public class Test1 {

    private String brand;
    private String menu;
    private int pay;

        public  void coffeBrand (String brand, String menu, int pay){
            this.brand = brand;
            this.menu = menu;
            this.pay = pay;

        }


    public void coffeBrandInfo (){
        System.out.println("선택하신 커피 브랜드는 " + brand + " 이며" + " 메뉴는 " + menu + "를 선택하셨습니다. 가격은 " + pay + "원 입니다." );
    }

    }

