package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        double score_d = (double)score;
        float score_f = (float)score;
        System.out.println(score_d);
        System.out.println(score_f);

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
    }
}
