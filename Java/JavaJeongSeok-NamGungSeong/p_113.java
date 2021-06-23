public class p_113 {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", str2=="abc");      // false - 내용은 같지만 서로 다르 객체
        System.out.printf("\"abc\"==\"abc\" ? %b%n", str2.equals("abc"));       // equals 사용하면 문자열 비교 가능
        // 대소문자 없이 비교하려면 equalsIgnoreCase() 사용
    }
}
