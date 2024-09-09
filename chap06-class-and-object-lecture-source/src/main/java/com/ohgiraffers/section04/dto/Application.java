package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        /* title. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점 */

        /* index. 1. 생성자를 이용한 초기화 */
        /* comment.
        *   장점 : setter 메소드를 여러 번 호출할 필요 없이 단 한 번에 호출로
        *         인스턴스를 생성 및 초기화를 할 수 있다.
        *   단점 : 매개변수의 갯수를 경우의 수 만큼 만들어줘야 한다.
        *         만약 호출 시 인자가 많아지는 경우 어떤 값이 어떤 필드를 의미하는 지 헷갈린다.
        *  */
        UserDTO user1 = new UserDTO("user01", "pass01", "정근희", LocalDateTime.now());
        System.out.println("user01 정보 : " + user1.toString());

        /* index. 2. 기본 생성자와 설정자를 이용한 초기화 */
        /* comment.
        *   장점 : 필드를 초기화 하는 값들이 어떤 필드를 지칭하는 지 명확하게 알 수 있다.
        *   단점 : 하나의 인스턴스를 생성할 때, 한 번에 호출로 끝나지가 않는다.
        *  */
        UserDTO user2 = new UserDTO();
        user2.setId("user01");
        user2.setPwd("pass01");
        user2.setName("정근희");
        user2.setEnrollDate(LocalDateTime.now());



    }
}
