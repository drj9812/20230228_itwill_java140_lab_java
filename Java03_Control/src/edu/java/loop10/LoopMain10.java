package edu.java.loop10;

import java.util.Scanner;

public class LoopMain10 {

    public static void main(String[] args) {
        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정할 변수.
        int balance = 0; // 은행 예금 잔고.
        Scanner scanner = new Scanner(System.in);
        
        while (run) {
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");
            
            int menu = scanner.nextInt();
            switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                run = false;
                break; // switch 문을 종료
            default:
            }
            
        }

        System.out.println("프로그램 종료");
    }

}
