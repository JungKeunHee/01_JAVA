package com.ohgiraffers.Test;


import java.io.FilterOutputStream;

public class Test1 {

    public static void main(String[] args) {

//        1~10 까지의 난수 5개를 랜덤적으로 뽑아 arr 배열에 중복 없이 저장하고, 출력하세요.

        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * 10) + 1;
            int[] arr = new int[5];
            arr[i] = randomNum;

            System.out.print(arr[i] + " ");

        }

    }
}
