package com.greedy.level02.normal;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출)
        //인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
        //가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
        //앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)

        System.out.println("=============첫 번째================");
        Scanner sc = new Scanner(System.in);

        System.out.print("최솟값을 입력하세요 : ");
        int min = sc.nextInt();
        System.out.println("최솟값을 " + min + "으로 지정했습니다");

        System.out.print("최댓값을 입력하세요 : ");
        int max = sc.nextInt();
        System.out.println("최댓값을 " + max + "으로 지정했습니다");

        RandomMaker randomMaker = new RandomMaker();
        randomMaker.randomNumber(min, max); //최솟값과 최댓값의 난수

        System.out.println("지정한 범위로 난수를 호출해드리겠습니다...");
        System.out.println("결과가 나왔습니다..");

        int randNum = randomMaker.randomNumber(min, max);

        System.out.println("지정한 범위의 난수는 " + randNum + "입니다");

        System.out.println("=============세 번째================");


        RandomMaker rand2 = new RandomMaker();
        rand2.rockPaperScissors();

        String a = rand2.rockPaperScissors();
        System.out.println("가위 바위 보 랜덤 1개 출력 : " + a);

        System.out.println("=============네 번째================");

        RandomMaker coin = new RandomMaker();
        coin.tossCoin();
        String tc = coin.tossCoin();

        System.out.println("동전 앞면 뒷면 둘 중 1개 출력 : " + tc);

//        System.out.println("=============두 번째================");
//
//        sc.nextLine();
//        System.out.print("출력하고 싶은 영어(대문자)를 입력 : ");
//        String upper = sc.nextLine();
//
//
//        System.out.print("출력하고 싶은 구간부터 숫자 입력 : ");
//        int rand5 = sc.nextInt();
//
//        RandomMaker randomAlphabet = new RandomMaker();
//        randomAlphabet.randomUpperAlphabet(upper, rand5);
//
//        String str2 = randomAlphabet.randomUpperAlphabet(upper, rand5);
//        System.out.println("입력한 수만큼 알파벳 출력 : " + str2);
//
//
    }
}
