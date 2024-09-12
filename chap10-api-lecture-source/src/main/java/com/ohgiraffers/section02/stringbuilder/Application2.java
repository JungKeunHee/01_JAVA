package com.ohgiraffers.section02.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        /* title. StringBuilder 의 특징을 확인해보자. */

        StringBuilder sb = new StringBuilder("javaMySQL");

        /* comment.
        *   delete() : 시작 인덱스와 종료 인덱스를 이용해서 제거
        *   deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나 제거
        *   - 중요!! 둘 다 원본에 영향을 미친다. WHY? 하나의 인스턴스이다.
        *  */

        System.out.println("delete() : " + sb.delete(2, 5));
        System.out.println("sb = " + sb);
        System.out.println("deleteCharAt() : " + sb.deleteCharAt(2));
        System.out.println("sb = " + sb);

        /* comment.
        *   insert() : 인자로 전달한 값을 문자열로 변환 후 지정한 위치에 삽입
        *   reverse() : 문자열 인덱스 순번을 역순으로 재배치
        *  */

        System.out.println("insert() : " + sb.insert(1, "avamy"));
        System.out.println("reverse() : " + sb.reverse());

    }
}
