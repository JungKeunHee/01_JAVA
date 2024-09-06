package com.ohgiraffers.section03.abstraction;

public class Car {

    // 관리 해야 할 상태 속력, 시동상태
    private boolean isOn;      //시동 상태
    private int speed;         //현재 속력

    public void startUp() {
            if(isOn){
                System.out.println("이미 시동이 걸려있습니다.");
            } else {
                this.isOn = true;
                System.out.println("시동을 걸었습니다. 출발 준비 완료!!!!!");
            }
    }

    public void go() {
            if(isOn){
                System.out.println("차가 앞으로 움직입니다~~~~");
                this.speed += 10;
                System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다!!!!!!!!");
            } else {
                System.out.println("차의 시동을 확인해주세요");
            }
    }

    public void stop() {
        //시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.
        if (isOn){
            if (this.speed > 0){
                this.speed = 0;
                System.out.println("끼~~~~~~~~~익!!!! 차가 멈췄습니다");
            } else {
                System.out.println("이미 차는 0km/h 인데요?");
            }
        } else {
            System.out.println("차의 시동이 걸려있지 않아 너가 얼마나 밟든 못 감 ㅅㄱ");
        }

    }

    public void turnOff() {
        // 시동이 걸려있다면 시동을 끄고, 이미 꺼져있다면 끌 수 없고, 움직이고 있다면 브레이크 먼저
        if (isOn){
            if (speed > 0){
                System.out.println("브레이크를 먼저 밟아주세요");
            } else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태 입니다.");
        }
    }
}

