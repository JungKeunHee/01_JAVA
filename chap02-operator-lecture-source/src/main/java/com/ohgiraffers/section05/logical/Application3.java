package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* title. 논리연결연산자의 진리표에 대해 이해할 수 있다. */

        /* comment.
        *   AND 연산과 OR 연산의 특징
        *   논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행조차 안 한다.
        *   논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행조차 안 한다.
        *  */

        /* index. 1. 논리 && 논리 : 앞의 결과가 false 일 때 뒤의 식 동작 확인. */
        int num1 = 10;

        /* comment.
        *   앞의 조건을 의도적으로 false로 강제화를 해두고
        *   뒤의 조건은 ++ 로 num1 의 값을 1 증가 시키는 코드를 작성했다.
        *   그래서 만약에 ++num1 동작을 했다면, result를 출력했을 때
        *   11이 나와야 하지만, 결과가 10이 나온 것을 보아하니
        *   뒤 코드가 동작하지 않은 것을 출력을 통해 확인을 해보았다.
        *  */

        int result = (false && ++num1 > 0) ? num1 : num1;

        System.out.println("&& 실행 확인해보기 : " + result);


        /* comment.
        *   &&의 조건식 두 개가 모두 만족을 해야 true 를 반환을 하는데
        *   첫 번째 조건식에서 false 가 나오게 되면
        *   뒤에 조건은 확인하지 않는다.
        *   따라서 컴퓨터가 일을 적게 하게 만들려면 => 속도 향상
        *   flase 나올 확률이 높은 조건을 앞에 두면 좋다.
        * */

        /* index. 2. 논리 || 논리 : 앞의 결과가 true 이면 뒤를 실행 안 함. */
        int num2 = 10;

        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("|| 연산 실행 화긴 : " + result2);

    }

}
