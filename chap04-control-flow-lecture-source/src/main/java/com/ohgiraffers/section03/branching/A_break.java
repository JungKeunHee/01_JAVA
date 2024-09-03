package com.ohgiraffers.section03.branching;

public class A_break {

    public void testBreakStatement(){

        /* title. braek 에 대해서 이해할 수 있다. */

        /* comment.
        *   break 문은 반복문 내에서 사용하게 된다.
        *   break 는 반복문을 빠져나올 때 사용하게 되며,
        *   박본문의 조건문 판단 결과와 상관 없이 반복문을 탈출하기 위해
        *   사용이 된다.
        *   일반적으로 if(조건식) { break; } 처럼 사용이 된다.
        *   단, switch 문은 반복문이 아니지만 예외적으로 사용이 된다
        *  */

        /* index. 1 ~ 100 합계를 구할건데, 조건절을 무한루프로 만들어보자. */
        // 합계를 담을 변수 선언
        int sum = 0;

        int i = 1;
        // 조건절에 true 를 넣어 반복문이 무한하게 돌게 만들었다.
        while(true){
            sum += i; // 반복 구절

            if (i == 100){
                break;
            }

            i++; // 증감식
        }

        System.out.println("1부터 100까지의 합은 " + sum + " 입니다.");


    }

    public void breakGugudan (){

        /* index.
        *   구구단 2 ~ 9 단까지 출력
        *   단, 각 단의 수가 5보다 큰 경우에는 출력을 생략한다.
        *   ex) 2 * 1, 2 * 2 ~~~ 2 * 5 끝
        *  */

        for (int dan = 2; dan < 10; dan++){

            /* index.
            *   break 문은 모든 반복문을 종료 시키는 게 아닌,
            *   자신에게 가장 인접한 반복문을 종료시킨다.
            *  */

            for(int su = 1; su < 10; su++){
                if (su > 5) {
                    break;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);

            }
            // 한칸 띄어쓰기
            System.out.println();
        }

    }

}
