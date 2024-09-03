package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /* title. for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* comment
        *   [for 문 표현식]
        *   for(초기식; 조건식; 증감식){
        *       조건을 만족하는 경우 수행할 구문(반복 구문);
        *   }
        * */

        // index. 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문
        // 초기식 : int i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public void testForExample1(){

        /* title. 무엇을 반복하는 지를 확인해서 반복문으로 개선할 수 있다. */

        /* comment.
        *   10 명의 학생 이름을 입력 받아 이름을 출력해보자
        *  */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1 번째 학생의 이름은 " + student1 + " 입니다");
//
//        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2 번째 학생의 이름은 " + student2 + " 입니다");
//
//        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3 번째 학생의 이름은 " + student3 + " 입니다");
//
//        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//        String student4 = sc.nextLine();
//        System.out.println("4 번째 학생의 이름은 " + student4 + " 입니다");
//
//        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("5 번째 학생의 이름은 " + student5 + " 입니다");
//
//        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//        String student6 = sc.nextLine();
//        System.out.println("6 번째 학생의 이름은 " + student6 + " 입니다");
//
//        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//        String student7 = sc.nextLine();
//        System.out.println("7 번째 학생의 이름은 " + student7 + " 입니다");
//
//        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//        String student8 = sc.nextLine();
//        System.out.println("8 번째 학생의 이름은 " + student8 + " 입니다");
//
//        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//        String student9 = sc.nextLine();
//        System.out.println("9 번째 학생의 이름은 " + student9 + " 입니다");
//
//        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//        String student10 = sc.nextLine();
//        System.out.println("10 번째 학생의 이름은 " + student10 + " 입니다");


        /* comment.
        *   반복해야 하는 내용
        *   -1. 안내 문구
        *   -2. 학생의 이름 입력 받아서 변수에 저장
        *   -3. 저장된 이름을 출력
        *  */

        Scanner sc = new Scanner(System.in);

        /* comment.
        *   둘 중 어떤 코드가 좋은 코드일까?
        *   둘다 좋은 코드다 WHY? -> 요구사항 만족했기 때문에 좋은 코드다.
        *   하지만, 반복문을 사용하는 것이 더 좋은 코드다.
        *   1. 보다 간결하게 작성이 되었다. (가독성 상승)
        *   2. 학생의 이름 뿐 아니라, 성적이나 이름을 입력하는
        *       기능도 추가를 해야 한다면? (유지 보수성 상승)
        *  */

        for(int i = 1; i <= 10; i++){
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();

            sc.nextLine();
            System.out.print(i + "번째 학생의 성적을 입력해주세요 : ");
            String grade = sc.nextLine();

            System.out.println(i + "번째 학생의 이름은 " + student + " 이며 " + grade + " 점 입니다");
        }

    }

    public void testForExample2(){
        /* index. 2. 1부터 10까지의 합계를 구하시오 */

        // 초기식 : i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++

        // 반복문 미사용
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // 합계를 저장하는 변수
        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println(sum);

        System.out.println("===============");

        int sum2 = 0;
        for(int i = 1; i <= 10; i++){
            sum2 += i;
        }
        System.out.println(sum2);
    }

    public void testForExample3(){
        /* index. 1. 문제
        *   5 ~ 10 사이의 난수를 발생시켜서
        *   1 부터 발생한 난수까지의 합계를 구해보자
        * */

        Random randNum = new Random();
        int random = (int)(Math.random() * 6) + 5;

        int sum3 = 0;
        for(int i = 1; i <= random; i++){
            sum3 += i;
        }
        System.out.println("난수의 발생 값 : " + random);
        System.out.println("1부터 " + random + "까지의 합계 : " + sum3);

    }

    public void testForExample4 () {
        /* comment.
        *   숫자 2개를 입력받아서 작은 수에서 큰 수까지의 합을 구하시오
        *   단, 두 숫자는 같지 않다를 가정하에 진행한다.
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하시오 : ");
        int first = sc.nextInt();

        System.out.print("두 번째 정수를 입력하시오 : ");
        int second = sc.nextInt();

        // 합산 결과를 담을 변수
        int sum = 0;

        // 만약 첫 번재 입력 정수가 더 큰 경우
            if(first > second){

                for(int i = second; i <= first; i++) {
                    sum += i;
                }
            } else {
                //만약 두 번째 입력 정수가 더 큰 경우
                for (int i = first; i <= second; i++){
                    sum += i;
                }
            }
            System.out.println(sum);

    }
    public void printSimpleGugudan () {

        /* comment.
        *   스캐너로 2 ~ 9 사이의 구구단 받아
        *   2 ~ 9 사이인 경우 구구단을 출력하고,
        *   그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해주세요"
        *   를 출력해보자
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력해주세요 : ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9){
            for (int su = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + dan * su);
            }

        } else {
            //dan 이라고 하는 값이 2 ~ 9 사이가 아닌 경우 작성 할 영역
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해주세요");
        }
    }
}



