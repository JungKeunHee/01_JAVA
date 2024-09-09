package com.ohgiraffers.section03.Test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        CarRacer carRacer = new CarRacer();

        while (true) {

        System.out.println("==========내가 만든 카레이싱=========");
        System.out.println("1. 시작");
        System.out.println("2. 전진");
        System.out.println("3. 브레이크");
        System.out.println("4. 시동 끄기");
        System.out.println("9. 프로그램 종료");
        System.out.print("번호 하나 입력 : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        switch(no) {
            case 1 :
                carRacer.start();
                break;

            case 2 :
                carRacer.go();
                break;

            case 3 :
                carRacer.stop();
                break;

            case 4 :
                carRacer.turnOff();
                break;

            case 9 :
                System.out.println("프로그램을 종료 합니다");
                break;

            default :
                System.out.println("잘못된 번호를 입력하셨습니다");
                break;
        }
        if(no == 9){
            break;
        }
        }
    }
}
