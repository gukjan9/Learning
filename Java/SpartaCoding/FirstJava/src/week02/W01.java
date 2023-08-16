package week02;

public class W01 {
    public static void main(String[] args) {
        // 산술연산자 : +, -, *, /, %(나머지), <<, >>
        // 비교연산자 : >, <, >=, <=, ==, !=
        // 논리연산자 : &&, ||, !
        // 대입연산자 : =, ++, --
        // 기타연산자 : (type), ? :, instance of

        // 비교연산자
        System.out.println(10 > 9);     // true
        System.out.println(10 < 9);     // false

        // 논리연산자
        // 비교 연산의 결과 값으로 받을 수 있는 boolean 값을 연결하는 연산자
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        // OR
        System.out.println(flag1 || flag3);     // true
        System.out.println(flag1 || flag2 || flag3);    // true

        System.out.println((5 > 3) || (3 > 1));     // true
        System.out.println((5 > 3) || (3 < 1));     // true
        System.out.println((5 < 3) || (3 < 1));     // false

        // AND
        System.out.println(flag1 && flag2);     // true
        System.out.println(flag1 && flag3);     // false
        System.out.println(flag1 && flag2 && flag3);    // false

        System.out.println((5 > 3) && (3 > 1));     // true
        System.out.println((5 > 3) && (3 < 1));     // false

        // 논리 부정 연산자 NOR
        System.out.println(!flag1);     // false
        System.out.println(!(5 == 5));  // false

        // 복합 대입 연산자
        int number = 10;
        number += 2;    // 12

        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + b--;
        System.out.println(val);    // 21
        System.out.println("a = " + a + ", b = " + b);      // a = 11, b = 9

        // 형변환 연산자
        int intNumber = 93 + (int)98.8;
        System.out.println(intNumber);      // 191

        // 삼항 연산자
        // 비교 연산자와 항상 함께 쓰인다.
        // 조건 ? 참 : 거짓
        int x = 1;
        int y = 9;

        boolean r = (x == y) ? true : false;
        System.out.println(r);      // false

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);      // 정답

        int max = (x > y) ? x : y;
        System.out.println(max);        // 9

        // instance of 연산자
        // 피연산자가 조건에 명시된 클래스의 객체인지 비교하여
        // 맞으면 true
        // 틀리면 false

        // 비트 연산자
        System.out.println(3 << 2);     // 12
        // 3 -> 11(2) 3 << 2 -> 1100(2) = 12
        System.out.println(3 << 1);     // 6
    }
}
