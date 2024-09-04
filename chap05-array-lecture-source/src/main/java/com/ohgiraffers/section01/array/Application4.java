package com.ohgiraffers.section01.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

       /* title. 배열을 사용한 예시(1) */

        /* index. 문제. 5명의 자바 점수를 정수로 입력 받아서
        *   합계와 평균을 실수로 구하는 프로그램 제작
        *  */

        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++ ) {
            // 개발자가 아닌 사람은 0부터 시작하는 숫자가 어색하기 때문에
            System.out.print((i + 1) + "번 째 학생의 자바 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        // 합계는 모든 배열의 인덱스 공간에 들어있는 값을 더해주면 된다.

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg = sum / scores.length;
        System.out.println("5명 점수의 자바 합계 : " + sum);
        System.out.println("5명 점수의 자바 점수 평균 : " + avg);

    }
}

