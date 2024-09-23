package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        /* title. FileWriter 를 이해하고 사용할 수 있다. */

        /* comment.
        *   프로그램의 데이터를 내보내기 위한 스트림
        *   FileOutputStream 과 다른 점은 글자(Character)
        *   단위로 데이터를 처리한다.
        *  */

        FileWriter fw = null;

        try {

            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'b', 'c', 'd'});
            fw.write("하이미디어아카데미");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null){
                try {
                    /* comment.
                    *   close 메소드는 닫기 전에
                    *   flush() 라는 메소드를 실행시키고
                    *   닫게 된다.
                    *   flush 란 무엇이냐면
                    *   통로에 남아있는 잔류 데이터를 밀어준다
                    *   라고 생각하면 된다.
                    *  */
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
