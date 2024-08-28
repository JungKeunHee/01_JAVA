package com.ohgiraffers.test;

public class test1 {

    public static void main(String[] args) {

//        /* title. 리터럴 1번 문제 */
//        long regNo;
//
//        regNo = 950920123456L;
//        System.out.println(regNo);
//
//        /* title. 리터럴 2번 문제 */
//        int i = 100;
//        long l = 100L;
//        final float PI = 3.14f;

        // 상수 : final
        // 변수 : i, l, PI
        // 리터럴 : 100, 100L, 3.14f

        /* title. 리터럴 3번 문제 */

        // 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ? (b, e)
//        byte b = 10;
//        char ch = 'A';
//        int i = 100;
//        long l = 1000L;
//        a. b = (byte)i;
//        b. ch = (char)b;
//        c. short s = (short)ch;
//        d. float f = (float)l;
//        e. i = (int)ch;


//        /* title. 연산자 1번 문제 */
//
//        int x = 2;
//        int y = 5;
//        char c = 'A'; // 'A' 65 의 문자코드는
//        System.out.println("======================================");
//        System.out.println(1 + x << 33);
//        System.out.println(y >= 5 || x < 0 && x > 2);
//        System.out.println(y += 10 - x++);
//        System.out.println(x+=2);
//        System.out.println( !('A' <= c && c <='Z') );
//        System.out.println('C'-c);
//        System.out.println('5'-'0');
//        System.out.println(c+1);
//        System.out.println(++c);
//        System.out.println(c++);
//
//
//        int num = 10;
//        num++;
//        System.out.println(num);
//        num--;
//        System.out.println(num);
//
//        int value = 20;
//        value += 10; // value = value
//        System.out.println(value);
//
//        double a = 5.5;
//        int b = 2;
//        double result = a + b * 3 - (int)(a / b);
//        System.out.println(result);
//
//        int xq = 10;
//        int yq = 20;
//        xq += yq / 2; // x = x + (y / 2)
//        yq -= xq * 2; // y = y - (x * 2)
//        System.out.println("xq: " + xq + ", yq: " + yq);

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + " 단 ");
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }

        }
    }

}
