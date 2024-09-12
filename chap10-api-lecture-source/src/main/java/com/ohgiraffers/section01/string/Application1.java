package com.ohgiraffers.section01.string;

public class Application1 {

    public static void main(String[] args) {

        /* title. String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다. */

        /* comment.
        *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환
        *  */

        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++){
            System.out.println("charAt (" + i + ") : " + str1.charAt(i));
        }

        /* comment.
        *   concat() : 문자열에 인자로 전달된 문자열을 합치기 해서
        *   새로운 문자열을 반환한다.
        *   단, 원본 문자열에는 영향을 주지 않는다.
        * */

        String str2 = "java";   // javamysql
        String str3 = "mysql";

        System.out.println("concat() 메소드 활용 : " + str2.concat(str3));
        System.out.println("concat() 동작 후 str2 의 값 : " + str2);

        /* comment.
        *   trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        *  */

        String trimStr = "   java   ";
        System.out.println("trimStr : @" + trimStr + "@");
        System.out.println("trim() : @" + trimStr.trim() + "@");
        System.out.println("trimStr = " + trimStr); // 역시 원본은 영향을 받지 않는다.

        /* comment.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔줌
        *   toUpperCase() : 모든 문자를 대문자로 바꿔줌
        *   마찬가지로 원본에는 영향을 미치지 않는다.
        *  */

        String caseStr = "JavaMySQL";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        /* comment.
        *   subString() : 문자열의 일부를 잘라내어 새로운 문자열 반환
        *  */

        String str4 = "JavaMySQL";
        System.out.println("subString(3, 6) : " + str4.substring(3, 6)); // aMy
        System.out.println("subString(3) : " + str4.substring(3)); // aMySQL

        /* comment.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 사용한다.
        *  */
        System.out.println("replace() : "+ str4.replace("Java", "python")); // pythonMySQL

    }

}
