package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /* title. 다형성을 적용하여 리턴타입에 활용할 수 있다. */

        /* comment.
        *   랜덤한 동물 인스턴스를 반환 받아
        *   울부짖게 만들기
        *  */

        Application3 app3 = new Application3();
        동물 random = app3.getRandomAnimal();

        random.울부짖기();

    }

    public 동물 getRandomAnimal(){

        // 개구리, 너구리 2개
        int random = (int)(Math.random() * 2);
        return random == 0 ? new 너구리() : new 개구리();
    }

}
