package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /* title 수업목표. 자동 형변환 규칙에 대해 이해할 수 있다. */

        /* comment.
        *  데이터 형변환
        *  데이터 형변환이 필요한 이유
        *   - 자바에서 다른 타입끼리의 연산은 모두 같은 타입인 경우
        *   - ex) int - int, char - char 등등
        *   - (중요) 즉, 같은 데이터 타입끼리만 연산이 가능하다.
        *  */

        /* comment.
        *  형변환의 종류와 규칙
        *  1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동으로 형변환 된다.
        *   1-2. 정수는 실수로 자동 형변환 된다.
        *   1-3. 문자형은 int 형으로 자동 형변환 된다.
        *   1-4. 논리형은 형변환 규칙에서 제외된다.
        *
        *  2. 강제형변환(명시적 형변환) : 형변환 연산자 ex) (long), (int)
        *                            를 이용한 강제적으로 수행하는 변환
        *   2-1. 자동이 안된다? -> 강제다.
        * */

        /* index. 1. 자동형변환 규칙 테스트*/
        /* index. 1-1. 작은 자료형에서 큰 자료형으로는 자동형변환 된다. */
        /* comment. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우
        *   데이터의 유실은 발생하지 않기 때문에 컴파일러가 자동으로 해준다. */

        /* index. 1-1-1. 정수끼리의 자동형변환 */
        byte bnum = 1; // 1
        short snum = bnum; // 2
        int inum = snum; // 4
        long lnum = inum; // 8

        /* comment. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰 계산해준다. */
        int num1 = 10;
        long num2 = 20;

//        int result1 = num1 + num2;
//        자동으로 큰 쪽인 long 으로 변경 후 계산하기 때문에 int형 변수 공간에 값을 담을 수 없다.

        long result1 = num1 + num2;
        // int + long 은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 으로
        // 변환을 자동으로 수행한 후 연산을 진행한다.

        /* index. 1-1-2. 실수끼리의 자동 형변환 */
        float fnum = 4.0f; // 4
        double dnum = fnum; // 8

//        float result2 = fnum + dnum; 마찬가지로 double이 더 큰 공간이므로 float으로 공간을 만들어주면 에러가 발생

        /* index. 1-2. 정수는 실수로 자동 형변환이 된다. */
        /* comment. 정수에서 실수로 변경할 때 소수점이 없어도 실수 형태로 표현이 가능하다.
        *   why? 그냥 소수점만 추가되는 것이기 때문에. */

        long eight = 8; // 8
        float four = eight; // 4

        // 정수와 실수의 연산은 항상 실수로 결과가 변환된다. ex) 30 + 30.0 = 60.0

        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        /* index. 1-3. 문자형은 int 형으로 자동 형변환 된다. */
        char ch = 'a';
        int charNum = ch;

        System.out.println("charNum = " + charNum);

        /* index. 1-4. 논리형은 형변환 규칙에서 제외 */
        /* comment. 어떠한 자료형이던 boolean은 형변환 해서 담을 수 없다. */
        boolean isTrue = true; // 1
//        byte b = isTrue;
//        short s = isTrue;

    }

}
