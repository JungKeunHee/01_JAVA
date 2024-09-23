package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /* title. FileReader 를 이해하고 사용할 수 있다. */

        /* comment.
        *   FileInputStream 과 사용 방법은 거의 동일하다
        *   하지만 큰 차이점은
        *   byte 단위가 아닌 character 단위로 읽어들이는 부분이
        *   가장 큰 차이점이다.
        *  */

        FileReader fr = null;

        try {

            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int value;

            while ((value = fr.read()) != -1) {
                System.out.println((char) value);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
