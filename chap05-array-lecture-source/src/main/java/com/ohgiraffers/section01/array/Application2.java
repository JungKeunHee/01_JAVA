package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* title. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */

        /* comment.
        *   배열의 사용 방법
        *   1. 배열의 선언
        *   2. 배열의 할당
        *   3. 배열의 인덱스 공간에 값 대입
        *  */

        /* index. 1. 배열의 선언 */
        /* comment.
        *   자료형[] 변수명;
        *   자료형 변수명[];
        *   방식이 두 가지 있는데 첫 번째 방식을 더 많이 사용한다.
        *  */

        /* comment. 선언 stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것. */
        int[] iarr;
        char carr[];

        /* index. 2. 할당 */
        /* comment.
        *   우리가 위에서 선언한 래퍼런스변수에 배열으 할당하여 대입할 수 있다.
        *   new 할당 연산자는 heap 영역에 공간을 할당하고, 발생한 주소값을
        *   반환해주는 연산자 이다.
        *   발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여
        *   사용하기 때문에 참조자료형(reference type) 이라고 한다.
        *  */

        // 배열 할당 시 반드시 배열의 크기를 지정해주어야 한다.
        // iarr = new int[]; 공간을 지정하지 않으면 에러 발생
        iarr = new int[5];
        carr = new char[10];

        // comment. 이렇게 선언과 동시에 할당을 할 수도 있다.
        int [] iarr2 = new int[5];
        char [] carr2 = new char[10];


        /* comment.
        *   heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근을 하는 것이다
        *   stacck 에 저장된 주소로 heap 에 할당이 된 배열을 찾아갈 수 있다.
        *  */
        System.out.println("iarr2 = " + iarr2);
        System.out.println("carr2 = " + carr2);

        /* comment.
        *   hashcode() : 일반적으로 객체의 주소값을 10진수 => 우리가 알 수 있는 정수
        *   로 바꾸어주는 메소드 동일객체인 지 비교할 때 주로 쓰인다.
        * */

        System.out.println("iarr2 의 hashcode : " + iarr2.hashCode());
        System.out.println("carr2 의 hashcode : " + carr2.hashCode());

        /* comment.
        *   배열의 길이를 알 수 있는 기능을 필드로 정의하고 있다.
        *   length;
        *   - 필드는 뒤에서 다룰거지만, 일종의 변수라고 생각하면 된다.
        *   그래서 String 경우에는 문자열의 길이를 메소드로 제공하고 있기 때문에
        *   사용 시에 length() 이렇게 사용을 하게 된다.
        *  */

        System.out.println("iarr2 의 길이 : " + iarr2.length);
        System.out.println("carr2 의 길이 : " + carr2.length);

        /* index. 3. 변수를 사용해서 배열의 길이 지정해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 입력해주세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];
        System.out.println("darr 의 hashcode : " + darr.hashCode());
        System.out.println("darr 의 길이 : " + darr.length);

        /* comment.
        *   하지만. 한 번 지정한 배열의 크기는 변경하지 못한다.
        *   배열의 사이즈를 6에서 10으로 쪼개는 게 아닌
        *   새로운 공간을 할당해서 주소값을 레퍼런스변수에 덮어 쓴 것이다
        *  */

        darr = new double[10];
        System.out.println("수정 후 darr 의 hashcode : " + darr.hashCode());
        System.out.println("수정 후 darr 의 길이 : " + darr.length);

        /* comment.
        *   한 번 할당된 배열은 지울 수 없다.
        *   다만 레퍼런스 변수를 null 로 변경하여 더 이상 주소를
        *   참조할 수 없게 된 배열은 일정 시간이 지나면
        *   heap 에 old 영역으로 이동하게 되어 GC(가비지 컬렉터)가
        *   삭제를 해준다.
        * */

        darr = null;
        /* comment.
        *   NullPointException
        *   아무것도 참조하지 않고 null 이라는 특수한 값을
        *   참조하고 있는 경우에 참조연산자 (.) 을 사용하게 될 때
        *   발생하는 에어
        *   가장 많이 볼 에러 중 1개이다.
        *  */

//        System.out.println("삭제 후 darr의 길이 : " + darr.length);

    }
}
