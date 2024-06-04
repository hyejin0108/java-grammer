package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args){
//            출력 : System.out
        int a = 20;
//        println : 줄바꿈 O
//          print : 줄바꿈 X
        String b = "hello world~";
        System.out.print(b);
        System.out.println(a);
        System.out.println(a+b); // 문자열과 숫자를 합하면 문자가 됨
//            입력: System.in
        // 숫자 + 숫자
        System.out.println(20+"10");

        // 입력
        Scanner sc = new Scanner(System.in);

    }
}
