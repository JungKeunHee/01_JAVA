package com.ohgiraffers.section04.use;

public class FireCar extends Car implements SoundHorn{


    @Override
    public void go() {
        System.out.println("소방차가 부아아아아아아아아아앙 하면서 움직입니다...");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다 끼이이이익!!!!!!!!!!!!!!");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 사이렌을 울립니다 삐용삐용~~~~~~~~~~");
    }
}
