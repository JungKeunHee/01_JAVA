package com.ohgiraffers.section01.polymorphism;

public class Application {

    public static void main(String[] args) {

        /* title. 다형성과 타입 형변환에 대해 이해할 수 있다. */

        /* comment.
        *   다형성이란?
        *   하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미한다.
        *   그렇기 때문에 하나의 타입으로 여러  타입의 인스턴스를 처리할 수 있고,
        *   하나의 메소드를 호출로 객체별로 각기 다른 방법으로 동작하게
        *   만들 수 있다.
        *  */

        동물 animal1 = new 동물();
        animal1.먹기();
        animal1.뛰기();
        animal1.울부짖기();

        System.out.println("=========너구리 생성==========");
        너구리 raccoon = new 너구리();
        raccoon.깨물기();
        raccoon.뛰기();
        raccoon.먹기();
        raccoon.울부짖기();

        System.out.println("=========개구리 생성==========");
        개구리 frog = new 개구리();
        frog.낼름공격();
        frog.뛰기();
        frog.먹기();
        frog.울부짖기();

        /* comment.
        *   개구리와 너구리는 동물 클래스를 상속 받았다.
        *   따라서 개구리는 개구리 이면서 동물이다.
        *   너구리도 너구리 이면서 동물이다.
        *  */

        /* index. 1. 부모 타입으로 자식 인스턴스 주소값 저장 */
        동물 a1 = new 개구리();
        동물 a2 = new 너구리();

        // 동물은 동물이지 개구리가 아니다 IS-A 관계가 성립 되어야 한다

        /* index. 2. 동적 바인딩 확인 */
        /* comment.
        *   컴파일 시점에는 해당 타입의 메소드와 연결(동물) 되어 있다가
        *   런타임 시 실제 객체가 가진 오버라이딩 된 메소드(개구리, 너구리)로 바인딩이 바뀌어
        *   동작하는 것을 의미한다
        *  */
        System.out.println("=========동적 바인딩 확인=========");

        a1.울부짖기();
        a2.울부짖기();

        /* comment.
        *   하지만 현재 레퍼런스 변수의 타입은
        *   동물이기 때문에 너구리와 개구리가 가진
        *   고융의 기능은 작동시킬 수 없다
        *  */
//        a1.낼름공격();

        /* index. 3. 타입 형변환 확인 */
        System.out.println("===============클래스타입 형변환===============");
        ((개구리)a1).낼름공격();
        ((너구리)a2).깨물기();

        // 주의사항 : 타입 형변환을 잘못하게 되면
        // 컴파일 시 문제가 없지만, 런타임 시 ClassCast 오류 발생
//        ((너구리)a1).깨물기();

        /* index. 4. instanceof 연산자로 확인 */
        System.out.println("===========instanceof==============");
        System.out.println("a1 이 개구리 타입인 지 확인 : " + (a1 instanceof 개구리));
        System.out.println("a1 이 너구리 타입인 지 확인 : " + (a1 instanceof 너구리));
        System.out.println("a1 이 동물 타입인 지 확인 : " + (a1 instanceof 동물));
        System.out.println("a1 이 오브젝트 타입인 지 확인 : " + (a1 instanceof Object));

        /* index. 5. 클래스의 업캐스팅과 다운캐스팅 */
        /* comment.
        *   클래스 형변환은 up-casting 과 down-casting 으로 구분할 수 있다.
        *   up : 상위 타입으로 형변환 ex) 개구리 -> 동물
        *   down : 하위 타입으로 형변환 ex) 동물 -> 개구리
        *  */

        동물 a3 = (동물)new 개구리(); // up-casting
        너구리 a4 = (너구리)new 동물(); // down-casting

    }
}
