package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /* title. 다형성을 사용해서 객체 배열을 만들어 연속처리 */
        동물[] animal = new 동물[5];
        animal[0] = new 개구리();
        animal[1] = new 너구리();
        animal[2] = new 개구리();
        animal[3] = new 너구리();
        animal[4] = new 개구리();

        for (int i = 0; i < animal.length; i++){
            animal[i].울부짖기();
        }

        for (int i = 0; i < animal.length; i++){
            // 동물들아 너가 개구리면 낼름 공격을 하고
            // 너가 너구리면 깨물기를 해라
            if (animal[i] instanceof 개구리){
                ((개구리)animal[i]).낼름공격();
            } else if (animal[i] instanceof 너구리){
                ((너구리)animal[i]).깨물기();
            }
        }

    }
}
