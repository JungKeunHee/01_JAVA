package com.ohgiraffers.section01.method;

public class Test {

    public String Name(String a) {
        return a;
    }


    public static void main(String[] args) {

        Test test = new Test();

        String result = test.Name("정근희");
            System.out.println(result);
    }
}
