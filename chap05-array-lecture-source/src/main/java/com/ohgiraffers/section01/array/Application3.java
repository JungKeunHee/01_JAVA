package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        /* title. 배열에 초기화 되는 자료형 별 기본값을 알 수 있다. */

        /* comment.
        *   정수 : 0
        *   실수 : 0.0
        *   논리 : false
        *   문자 : \u0000
        *   참조 : null
        *  */

        int[] iarr = new int[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

//        iarr[0] = 10;
        /* comment.
        *   자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 겨우에는 블럭({}) 을 이용한다.
        *   블럭을 사용하는 겨우에는 new 를 사용하지 않아도 되며,
        *   값의 갯수만큼 자동으로 크기가 설정된다.
        *  */

        //new 생략
        int[] iarr2 = {11, 22, 33, 44, 55};

        //new를 쓴다면 이런 식으로도 가능하다
        int[] iarr3 = new int[]{11, 22, 33, 44, 55};

        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2 [ " + i + " ] = " + iarr2[i]);
        }

        System.out.println("======================================");

        for (int i = 0; i < iarr3.length; i++) {
            System.out.println("iarr3 [ " + i + " ] = " + iarr3[i]);
        }

        System.out.println("======================================");

        String[] sarr = {"apple", "banana", "orange"};
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr [ " + i + " ] = " + sarr[i]);
        }

    }

}
