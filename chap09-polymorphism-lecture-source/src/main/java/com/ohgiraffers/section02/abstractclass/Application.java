package com.ohgiraffers.section02.abstractclass;

public class Application {

    public static void main(String[] args) {

        /* title. 추상 클래스와 추상 메소드에 대해 이해할 수 있다. */

        /* comment.
        *   추상클래스와 추상메소드
        *   추상메소드를 0개 이상 가지고 있는 클래스를 추상클래스라고 한다.
        *   추상클래스는 클래스 선언부에 abstract 라고 명시 해야 한다.
        *   추상클래스는 클래스인 척 하는 녀석이기 때문에
        *   직접적으로 인스턴스를 생성할 수 없다.
        *   그렇기 때문에 추상클래스를 사용하기 위해서는 상속 받은
        *   자식클래스를 이용해서 인스턴스를 생성해야 한다.
        *  */

        /* index. 1. 추상클래스는 인스턴스를 생성할 수 없다. */
//        Product product = new Product();

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* index. 2. 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용 */
        Product product = new SmartPhone();
        

    }
}
