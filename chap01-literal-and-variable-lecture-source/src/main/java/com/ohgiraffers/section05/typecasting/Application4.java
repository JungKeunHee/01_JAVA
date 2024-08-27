package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        /* title. 형변환 시 주의점을 이해하고 사용할 수 있다. */

        /* comment.
        *   형변환 시 주의점.
        *   데이터 손실!!!!!!!!!!!!!!
        *  */

        /* index. 1. 의도하지 않은 데이터 손실 */
        int inum = 290; // 1byte -128 ~ 127
        byte bnum = (byte)inum;

        System.out.println("bnum = " + bnum);

        /* index. 2 의도한 데이터 손실 */
        double height = 175.5;

        int floorheight = (int)height;
        System.out.println("floorheight = " + floorheight);
    }
}
