package com.ohgiraffers.test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


    /* title. ArrayList 활용 예제(1) */

    /* comment.
     *   요구사항
     *   1. 클래스는 Application, BookDTO 클래스로 구성한다.
     *   2. Application 클래스는 main 메소드를 포함한다.
     *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다.
     *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.
     *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며
     *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다.
     *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
     *      2번째 인덱스에 추가를 할 것이다.
     *  */

    /* comment.
     *   출력 예시
     *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
     *   출력하는 구문을 작성하라.
     *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라.
     *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.
     *  */

        List<BookDTO> bookList = new ArrayList<>();
        System.out.println("=========================현재 보관중인 책 목록=======================");
        bookList.add(new BookDTO(1, "A책", "정근희1", 10000));
        bookList.add(new BookDTO(3, "C책", "정근희3", 30000));
        bookList.add(new BookDTO(4, "D책", "정근희4", 40000));
        bookList.add(new BookDTO(5, "E책", "정근희5", 50000));


        for (int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
        System.out.println("=================================================================");

        System.out.println("=========추가하려는 책 입력=========");
        Scanner sc = new Scanner(System.in);
        System.out.print("책 번호를 입력 해주세요 : ");
        int no = sc.nextInt();

        sc.nextLine();
        System.out.print("책 이름을 입력 해주세요 : ");
        String bookName = sc.nextLine();

        System.out.print("저자를 입력해주세요 : ");
        String personName = sc.nextLine();

        System.out.print("책 가격을 입력해주세요 : ");
        int price = sc.nextInt();

        System.out.println("=================================");

        BookDTO bookDTO = new BookDTO(no, bookName, personName, price);

        System.out.print("추가하려는 자릿수(인덱스) 입력해주세요 : ");
        int indexNo = sc.nextInt();
        bookList.add(indexNo, bookDTO);

        System.out.println("=============추가되고 난 후 책 목록=============");
        for (BookDTO books : bookList){
            System.out.println(books);
        }
        System.out.println("=============================================");

    }
}
