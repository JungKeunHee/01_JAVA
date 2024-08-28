package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /* title. 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */

        /* index. 1. methodA(), methodB(), methodC() 차례로 작성 */
        /* index. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구분을 작성 */
        /* index. 3. 메인메소드 실행 종료를 확인하기 위한 출력 구문을 작성  */

        System.out.println("main() 시작됨...");

        /* index. 4. methodA(), B(), C() 차례로 호출을 해보자. */

        Application2 app = new Application2();
        app.methodA();

        app.methodB();

        app.methodC();

        System.out.println("main() 종료됨...");


    }

    public void methodA() {
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");
    }
}
