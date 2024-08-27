package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기
        *  자료형 별 최대 범위를 벗어나는 경우
        *  오버플로우 라고 한다.
        *  */

        /* 목차 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 = " + num1); // 127 : byte 의 최대 저장범위

        num1++; // num1 에다가 +1을 한다라는 뜻(1증가)
        System.out.println("num1 overflow 확인하기 : " + num1);

        /* 목차 2. 언더플로우 */
        byte num2 = -128; // byte 자료형의 최솟값
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 underflow 확인하기 : " + num2);
        
        /* 오버플로우랑 언더플로우가 발생 했으나,
        컴파일 에러나 런타임 에러는 발생하지 않았다.
        그렇기 때문에 최대값 혹은 최소값의 범위를
        고려해서 코드를 작성해야 한다는 의미이다.
        */
        
        int firstNnum = 1000000; // 100만
        int secondNum = 700000; // 70만
        // 7천억 예상값
        // 양수 21억 정도까지 저장가능하다.
        
        int multi = firstNnum * secondNum;
        System.out.println("multi = " + multi);
        
        long longMulti = firstNnum * secondNum;

        /* 우리는 더 넓는 저장 고간을 마련 했음에도 불구하고
        * 이상한 값이 나왔다.
        * 그 이유는 이미 오버플로우 된 값을 저장한 것 뿐이기 때문에
        * 계산 처리 전에 미리 long 타입으로 자료형을 변경해야 한다.
        *  */
        System.out.println("longMulti = " + longMulti);

        long result = (long) firstNnum * secondNum;
        // 강제 형변환을 이용한 결과값 출력해보기
        System.out.println("result = " + result);

    }
}
