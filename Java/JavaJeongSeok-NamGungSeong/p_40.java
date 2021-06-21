/* Scanner */
import java.util.*;

public class p_40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스의 객체 생성

        String input = scanner.nextLine();      // 입력 받기
        int num = Integer.parseInt(input);      // 입력 받은 문자열을 숫자로 변환

        System.out.println("What I wrote : " + input);
        System.out.printf("num = %d%n", num);

        scanner.close();                        // close - Scanner 선언했으면 꼭 닫아줘야한다.
    }    
}
