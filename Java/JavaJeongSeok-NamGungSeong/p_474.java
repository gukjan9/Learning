public class p_474 {
    public static void main(String[] args){
        int i = 100;
        String str1 = i + "";               // 100 -> "100" method1
        String str2 = String.valueOf(i);    // method2

        int j = Integer.parseInt("100");
        int j2 = Integer.valueOf("100");
    }
}
