package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        /* title. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* comment.
        *   생성자란?
        *   우리가 지금까지 클래스명 레퍼렁스변수명 = new 클래스명();
        *   이렇게 객체를 만들어왔다.
        *   new 뒤에 클래스명은 사실 생성자(constructor) 라고 불리는 메소드를
        *   호출하는 구뭉이다.
        *   하지만 우리는 지금까지 생성자를 만든 적이 없는데
        *   매개변수가 없는 생성자는 compiler 에 의해 자동으로 추가되기 때문에
        *   우리가 지금까지 작성하지 앟고도 사용할 수 있게 되었다.
        *  */

        UserDTO user = new UserDTO();
        System.out.println("user 의 초기값 : " + user.toString());

        /* comment.
        *   기본 생성자로 인스턴스를 생성하게 되면 jvm 이 제공하는 기본값들로
        *   값이 초기화가 된다.
        *   하지만 우리가 초기값을 대로 생성하자마자 넣고 싶으면
        *   매개변수가 있는 생성자로 값을 인자로 전달하면 된다.
        *   주의점!!!
        *   만약에 매개변수가 있는 생성자가 존재한다면
        *   기본 생성자는 컴파일러가 자동으로 추가해주지 않는다.
        *   따라서 이 점은 주의해야 한다.
        *  */

        UserDTO user2 = new UserDTO("user01", "pass01", "정근희");
        System.out.println("user2 의 초기값 : " + user2.toString());

        UserDTO user3 = new UserDTO("user01", "pass01", "정근희", LocalDateTime.now());
        System.out.println("user3 의 초기값 : " + user3.toString());
    }

}
