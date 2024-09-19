package com.ohgiraffers.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {

        /* title. TreeSet 에 대해 이해하고 사용할 수 있다. */

        /* comment.
        *   TreeSet 클래스는 데이터가 정렬 된 상태로 저장되는
        *   이진 검색 트리 형태로 요소를 저장하게 된다
        *   이진 검색 트리 구조는 데이터를 추가하거나 제거하는 등의
        *   기본 동작 시간이 매우 빠르다.
        *  */

        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        // 자동 오름차순 정렬을 해준다.
        System.out.println(tset);

        /* comment. 로또번호 추첨기
            요구사항
        *   1. 로또 번호는 중복이 될 수 없다.
        *   2. 로또 번호는 오름차순 정렬로 나오게 한다.
        * */

        // 다형성을 적용해서 인스턴스 생성
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6){
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("이 번주 로또 당첨 번호는!!!");
        System.out.println(lotto);
    }
}
