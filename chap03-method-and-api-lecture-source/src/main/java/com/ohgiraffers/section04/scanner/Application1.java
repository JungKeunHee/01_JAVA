package com.ohgiraffers.section04.scanner;


import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {


    /* title. Scanner를 이용해서 값 입력 해보기 */

    /* index. 1. Scanner 클래스 사용할 준비  */
    Scanner sc =  new Scanner(System.in);


        /* comment
        *   ln의 의미는 개행(줄바꿈, enter 키)의 의미이다.
        * */
//        System.out.println("안녕");
//        System.out.print("나는");
//        System.out.println("정근희야");
//
//        /* index. 2-1 문자열 입력받기 */
//        System.out.print("이름을 입력해주세요 : ");
//        String name = sc.nextLine();
//        System.out.println("제 이름은 " + name + " 입니다.");

        /* index. 2-2. 정수형 값 입력 받기 */
        /* comment. nextInt() : 입력 받은 값을 int형으로 반환해준다 */

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("제 나이는 " + age + " 세 입니다.");

        /* index. 2-3. 실수형 값 입력 받기 */
        System.out.print("키를 입력해주세요 : ");
        double height = sc.nextDouble();
        System.out.println("제 키는 " + height + "(cm) 입니다.");

        /* index. 2-4 논리형 값 입력 받기 */
        System.out.print("참 과 거짓 둘 중 하나를 true or false 로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력 한 논리 값은 : " + isTrue + "입니다");

        /* index. 2-5. 문자형 값 입력 받기 */
        /* comment.
        *   아쉽게도 문자를 입력 받는 기능은 없다.
        *   따라서 문자열로 입력을 받은 후, 입력 받은 문자에서
        *   원하는 순번의 문자를 분리해서 사용을 해야 한다.
        *   charAt(int index)를 사용해서 문자열을 분리 할 수 있다.
        *   정수형으로 값을 넘기게 되면 문자열에서 해당하는 번호를 가진
        *   문자를 반환해주는 기능을 한다.
        *   index 숫자 체계는 컴퓨터에서 정말 많이 쓰인다.
        *    이 친구으 특징은 0부터 시작한다
        * */



        sc.nextLine();
        System.out.print("아무 문자나 입력 해주세요 : ");
        char ch = sc.nextLine().charAt(1);
        System.out.println("입력하신 문자는 " + ch + " 입니다");


//        // 두 숫자를 입력받아서 더하기
//        System.out.print("첫 번째 숫자를 입력 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력 : ");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("두 수의 합계는 : " + sum + " 입니다.");
//




    }
}

