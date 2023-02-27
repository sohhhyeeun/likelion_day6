package com.ll;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0;

        while(true) {
            System.out.printf("숫자 : ");

            try {
                input = sc.nextInt(); // 대기, 숫자 하나 입력될 때 까지
                break;
            }
            catch ( InputMismatchException e ) {
                sc.nextLine(); // 버퍼를 비운다.
                System.out.println("숫자를 입력해주세요.");
            }
        }

        System.out.printf("입력된 숫자 : %d\n", input);

        sc.close();
    }
}
