package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    /* title. if, if-else, if-else-if 문 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */

    /* comment.
    *   [if-else-if 문 표현식]
    *   if(조건식 1) {
    *       조건식 1이 true일 때 실행할 구문;
    *   } else if(조건식 2)
    *       조건식 1이 false 이고 조건식 2가 true일 때 실행할 구문;
    *   } else {
    *       위의 조건 2개가 모두 거짓일 경우 실행할 구문;
    *   }
    *  */

    /* comment.
    *   if-else-if 문은 조건식 1의 결과 값이 참(true) 이면 if {} 블럭 실행,
    *   조건식 1이 false 이면 조건식 2를 확인하여 참(true) 이면 else if {}
    *   블럭 실행한다.
    *   조건식 1, 2, 의 결과가 모두 거짓(false)이면 else {} 블럭을 실행한다.
    *  */


    public void testIfElseIfStatement (){
        System.out.println("산 속에서 나무를 하던 나무꾼이 연목에 도끼를 빠뜨리고 말았다...");
        System.out.println("그 때... 연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 듣고 나타났다...");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 너의 도끼인 지 물어보게 되는데...");

        System.out.println("================================================================");

        System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1){
            System.out.println("산신령 : 이런 거짓말쟁이 너에게는 아무 것도 줄 수 없다!!!! 썩 꺼지거라");
        }
        else if (answer == 2){
            System.out.println("산신령 : 욕심이 과하지는 않지만 그래도 거짓말을 하고 있구나.. 너에게 줄 건 없다.");
        }
        else if (answer == 3){
            System.out.println("산신령 : 오호 아주 정직한 아이로구나!! 여기 있는 도끼를 너에게 다 주겠노라");
        }
        else {
            System.out.println("산신령 : 뭐라는거니?");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 떠났다...");
    }

    public void testNestedIfElseIfStatement (){
        /* comment. 중첩 된 if-else-if 구문 */

        /* index. 1. 문제
        *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력
        *   학점 등급을 매기는 채점방식을 사용하고 있다.
        *   학생의 이름과 점수를 입력 받아
        *   90점 이상이면 'A'. 80점 이상이면 'B', 70점 이상 'C'
        *   60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄 것이다.
        *   추가로 각 등급의 중간점수(ex 65,75, 85, 95) 이상이면
        *   '+' 를 붙여서 줄 것이다.
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";

        if(point >= 90){
            grade = "A";

            if (point >= 95){
                grade += "+"; // grade = grade + "+";
            }
        }
        else if(point >= 80){}
            grade = "B";

            if (point >= 85){
                grade += "+";
            }

            else if (point >= 70){
                grade = "C";
                if (point >= 75){
                    grade += "+";
                }
            }
            else if (point >= 60){
                grade = "D";
                if (point >= 65){
                    grade += "+";
                }
            }
            else {
                grade = "F";
            }
        System.out.println(name + "학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
    }

    // 개선 시켜보기
    public void improvetestNestedIfElseIfStatement (){
        /* comment. 중첩 된 if-else-if 구문 */

        /* index. 1. 문제
         *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력
         *   학점 등급을 매기는 채점방식을 사용하고 있다.
         *   학생의 이름과 점수를 입력 받아
         *   90점 이상이면 'A'. 80점 이상이면 'B', 70점 이상 'C'
         *   60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄 것이다.
         *   추가로 각 등급의 중간점수(ex 65,75, 85, 95) 이상이면
         *   '+' 를 붙여서 줄 것이다.
         *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";

        if(point >= 90){
            grade = "A";
        }
        else if(point >= 80){
        grade = "B";
        }
        else if (point >= 70){
            grade = "C";
        }
        else if (point >= 60){
            grade = "D";
        }
        else {
            grade = "F";
        }

        // 각 등급의 중간 점수 이상이면서 60점 이상인 경우 + 를 붙이기
        if(point % 10 >= 5 && point >= 60){
            grade += "+";
        }

            System.out.println(name + "학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
    }

}
