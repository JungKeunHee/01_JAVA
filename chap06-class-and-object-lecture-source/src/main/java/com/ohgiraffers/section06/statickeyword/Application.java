package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* title. static 키워드에 대해 이해할 수 있다. */

        /* comment.
        *   static
        *   정적 메모리 영역에 프로그램이 start 될 때 할당하는 키워드이다.
        *   인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에
        *   지정을 할 수 있다.
        *   여러 인스턴스가 공유해서 사용할 목적의 공간이며
        *   의도에 맞게 사용하면 좋은 코드를 만들 수 있지만,
        *   static 키워드의 남발은 유지보수와 추적이 힘든 코드를
        *   작성하는 피해야 할 방식이다.
        *   즉, 명확한 목적이 없다면 static 키워드는 자제하는 것이 좋다.
        *   의도적으로 static 키워드를 사용하는 대표적인 예시는
        *   singleton 객체를 만들 때이다.
        *  */


        StaticFieldTest sft1 = new StaticFieldTest();

        /* index. 1. 두 필드의 가지고 있는 값 확인 */
        System.out.println("nonStatic 필드 값 : " + sft1.getNonStaticCount());
        System.out.println("Static 필드 값 : " + sft1.getStaticCount());

        /* index. 2. 두 필드의 값을 1씩 증가시키는 메소드 호출 */
        sft1.increasenonStaticCount();
        sft1.increaseStaticCount();

        /* index. 3. 증가 시킨 후 변경 된 값 확인 */
        System.out.println("수정 된 nonStatic 필드 값 : " + sft1.getNonStaticCount());
        System.out.println("수정 된 Static 필드 값 : " + sft1.getStaticCount());


        /* index. 4. 새로운 StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sft2 = new StaticFieldTest();

        /* index. 5. sft2 의 필드가 가지고 있는 값 확인하기 */
        System.out.println("sft2 의 nonStatic 필드 값 : " + sft2.getNonStaticCount());
        System.out.println("sft2 의 Static 필드 값 : " + sft2.getStaticCount());

        /* comment.
        *   인스턴스 변수의 경우에는 sft1 과 sft2 두 개의 인스턴스가
        *   서로 값을 공유하지 못 한다.
        *   따라서 new 키워드를 만나는 순간 0 이라는 기본값으로 초기화가 된다.
        *   하지만 static 필드의 경우 클래스변수 자체가 프로그램을 종료할 때 까지
        *   유지되고 있기 때문에 값을 유지하는 것을 확인했다.
        *   따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로
        *   필드에 static 키워드를 사용하게 된다.
        *  */

        /* index. 6. static 메소드를 확인  */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();
        /* comment.
        *   static 메소드는 이렇게 호출을 할 수 있긴 하다.
        *   하지만, static 메소드는 인스턴스를 생성하지 않아도 되는
        *   메소드 이기 때문에 static 메소드는 정적 영역에 두고
        *   인스턴스를 생성하지 않고 호출할 목적으로 작성을 하기 때문에
        *   아래처럼 사용하는 것은 권장하지 않는다.
        *  */
        smt.staticMethod(); // 밑에 노란색줄이 생긴다면 권장하지 않는 방법이라는 뜻

        /* index. 7. static 메소드 호출 */
        /* comment.
        *   static 키워드가 붙은 메소드는
        *   인스턴스를 생성하지 않고 호출할 수 있기 때문에
        *   클래스명.메소드명()
        *   이렇게 호출을 하게 된다.
        *  */
        StaticMethodTest.staticMethod();

    }


}
