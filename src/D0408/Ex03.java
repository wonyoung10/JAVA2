package D0408;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend; // 나뉨수
        int divisor; // 나눗수
        int ans = 0;
        System.out.print("나뉨수를 입력하시오: ");
        dividend = sc.nextInt(); // 나뉨수 입력
        while(true) {
            
            try {
                System.out.print("나눗수를 입력하시오: ");
                divisor = sc.nextInt(); // 나눗수 입력
                ans = dividend / divisor;
                break;
            }
            catch (ArithmeticException e) {
                System.out.println("정수가 아닙니다. 다시 입력 하세요!");
                continue;
            }
        
        }
        System.out.println(dividend + "를" + divisor + "로 나누면 몫은 " + ans + "입니다.");    
                sc.close(); // Scanner 객체 닫기. (중요!)
        
        
        
        
        
    }

}
