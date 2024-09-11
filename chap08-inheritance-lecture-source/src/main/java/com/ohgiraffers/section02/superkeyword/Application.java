package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        /* title. super 와 super() 에 이해할 수 있다. */

        /* comment.
        *   super : 자식클래스를 이용해서 객체를 생성할 때 부모의 생성자도
        *           호출하여 부모 클래스의 인스터스도 같이 생성한다
        *           이 때 생성한 부모 클래스의 인스턴스 주소를 보관하는
        *           래퍼런스 변수이다.
        *   super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수
        *             타입, 갯수, 순서가 일치하는 부모의 생성자를 호출한다.
        *  */

        Product product1 = new Product();
        System.out.println(product1.getInfo());

        Product product2 = new Product("S-01234", "삼성", "갤럭시폴드6", 200000, LocalDateTime.now());
        System.out.println(product2.getInfo());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInfo());

        Computer computer2 = new Computer("인텔", 512, 16, "window");
        System.out.println(computer2.getInfo());

        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시폴드6", 200000, LocalDateTime.now(), "인텔", 512, 16, "window");
        System.out.println(computer3.getInfo());

    }
}
