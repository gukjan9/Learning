import java.util.*;

public class p_152 {
    public static void main(String[] args){
        char gender;
        String num = "";

        System.out.print("Insert ID : ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLine();

        gender = num.charAt(7);             // 8번째 문자열 저장

        System.out.println(gender);
    }
}
