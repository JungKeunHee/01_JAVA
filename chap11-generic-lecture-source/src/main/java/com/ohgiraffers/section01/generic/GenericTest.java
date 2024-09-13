package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    /* comment.
     *   제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자(<>) 를
     *   이용해서 작성을 하게 된다.
     *  */

    /* comment.
    *   다이아몬드 연산자 내부에 작성한 T 는 타입 변수라고 부른다.
    *   타입 변수를 자료형 대신 사용을 할 것인데,
    *   가상으로 존재하는 타입이며, 굳이 T 가 아니라 다른 영문자를 사용해도
    *   상관없다. 하지만, T 를 많이 쓴다.(TYPE)
    *   또한 여러 개의 타입 변수를 작성할 때에는 나열 연산자(,) 를 이용해서
    *   여러 개 기술 할 수 있다.
    *   사용하는 쪽에서는 우리가 만든 제네릭 클래스를 사용할 때,
    *   <T> <- 대신에 <우리가 지정한 자료형>
    *   실제 사용할 타입을 타입 변수 자리에 맞춰서 넣어주면
    *   컴파일 시점에 타입이 결정되게 된다.
    *  */

    // 아직 타입이 정해지지 않은 상태 T -> 가상의 자료형
    private T value;

    // getter / setter 작성 시에도 구체적인 타입 대신 가상의 타입(T) 를 사용할 수 있다.
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
