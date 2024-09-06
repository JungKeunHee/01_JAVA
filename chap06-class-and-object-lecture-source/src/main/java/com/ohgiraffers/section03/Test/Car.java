package com.ohgiraffers.section03.Test;

public class Car {

    private boolean isOn;
    private int speed;


    public void start() {
        if (isOn){
            System.out.println("시동을 걸어주세요");
        } else {
            this.isOn = true;
            System.out.println("시동이 걸렸습니다!!!!!!!!!!!!");
        }
    }

    public void go() {
        if(isOn){
            this.speed += 10;
            System.out.println("자동차가 출발합니다 현재 시속은 " + this.speed + "km/h 입니다");
        } else {
            System.out.println("시동을 먼저 걸어주세요!!");
        }
    }

    public void stop() {
        if (isOn){
            if (speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다 현재 시속은 " + this.speed + "km/h 입니다");
        } else {
                System.out.println("현재 차가 멈춰 있습니다");
            }
        } else {
            System.out.println("시동을 먼저 걸어주세요!! 제발!!");
        }
    }

    public void trunOff() {
        if (isOn){
            if (speed > 0){
                System.out.println("브레이크를 먼저 밟아주세요!!");
            } else {
                System.out.println("시동이 꺼졌습니다.");
            }
        } else {
            System.out.println("시동도 안걸었는데 왜 시동을 끄지?");
        }
    }
}
