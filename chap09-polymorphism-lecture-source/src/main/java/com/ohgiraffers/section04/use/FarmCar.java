package com.ohgiraffers.section04.use;

// 경운기는 차의 기본적인 가능(가고, 서고) 할 수 있지만,
// 경적을 울리는 기능은 없다.
public class FarmCar extends Car{


    @Override
    public void go() {
        System.out.println("FarmCar가 덜덜덜덜덜 움직입니다...");
    }

    @Override
    public void stop() {
        System.out.println("FarmCar가 멈췄습니다....");

    }
}
