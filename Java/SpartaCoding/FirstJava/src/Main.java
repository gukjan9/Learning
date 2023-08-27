public class Main {
    public static void main(String[] args) {
        char alphabet1 = 'A'; // 문자형
        String alphabet2 = "B"; // 문자열

        // 명시적 형변환
        int intNumber = 10;
        double doubleNumber = (double)intNumber;    // 10.0
        float floatNumber = (float)intNumber;    // 10.0

        // 암시적 형변환
        // byte -> int
        byte byteNumber = 10;
        intNumber = byteNumber;
        System.out.println(intNumber);      // 10

        // char -> int
        char charAlphabet = 'A';
        intNumber = charAlphabet;
        System.out.println(intNumber);      // 65

        // int -> double
        intNumber = 200;
        doubleNumber = intNumber;
        System.out.println(doubleNumber);       // 200.0

        intNumber = 10;
        doubleNumber = 5.5;
        double result = intNumber + doubleNumber;    // 15.5
    }
}