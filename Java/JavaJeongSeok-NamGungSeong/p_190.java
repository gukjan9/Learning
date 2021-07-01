public class p_190 {
    public static void main(String[] args){
        int[] score = {50, 60};             // 괄호 앞에 new int 생략 가능

        int[] score2;
        score2 =  new int[]{50, 60};            // 따로 선언시 new int 생략 불가능

        // 길이가 0인 배열 선언
        int[] score00 = new int[0];
        int[] score01 = new int[]{};
        int[] score02 = {};                 // new int 생략

        int[] iArr = {50};                  // 배열의 주소값 출력
        char[] chArr = {'a'};               // char형 배열은 문자 출력
    }
}
