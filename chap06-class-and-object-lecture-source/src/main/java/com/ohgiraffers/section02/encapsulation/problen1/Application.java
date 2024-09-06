package com.ohgiraffers.section02.encapsulation.problen1;

public class Application {
    public static void main(String[] args) {


    /* title. 필드에 직접 접근했을 때 발생할 수 있는 문제를 이해할 수 있다.(1) */

    /* comment. 필드에 옳바르지 않은 값이 들어가게 되어도 통제가 불가능하다. */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();

        monster1.name = "하츄핑";
        monster1.hp = 200;

            System.out.println("monster1.name = " + monster1.name);
            System.out.println("monster1.hp = " + monster1.hp);

        // 2번 몬스터
        Monster monster2 = new Monster();

        monster2.name = "시진핑";
        monster2.hp = -20;

            System.out.println("monster2.name = " + monster2.name);
            System.out.println("monster2.hp = " + monster2.hp);

            /* comment.
            *   이렇게 변수에 직접 값을 넣게 되면
            *   검증되지 않는 값을 넣어도 막을 방법이 없다.
            * */

        // 3번 몬스터
        Monster monster3 = new Monster();

        monster3.name = "티니핑";
        monster3.setHp(-200);

            System.out.println("monster3.name = " + monster3.name);
            System.out.println("monster3.hp = " + monster3.hp);


        // 4번 몬스터
        /* comment.
        *   우리는 검증되지 않은 값을 처리하는 메소드를 만들었다.
        *   하지만 아직도 필드에 직접적으로 접근을 할 수 있다.
        *  */

        Monster monster4 = new Monster();
        monster4.name = "핑";
        monster4.hp = -1000;

        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);


    }

}
