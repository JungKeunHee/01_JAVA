package com.ohgiraffers.section01.extend;

public class FarmCar extends Car{

    public FarmCar(){
        System.out.println("FarmCar 의 기본생성자 호출됨...");
    }

    @Override
    public void run() {
        System.out.println("털털털털털털털털털털.....");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적을 울리고 싶으나 경적이 없다....");
    }

    @Override
    public void stop() {
        System.out.println("푸슝...");
    }
}
