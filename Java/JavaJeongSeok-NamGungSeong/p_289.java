public class p_289 {
    public static void main(String[] args){
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
    }

    static String concatenate(String delim, String... args){       // delimeter - 구분 문자
        String result = "";

        for(String str : args){
            result += str + delim;
        }
        return result;
    }
}
