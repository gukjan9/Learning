import java.util.regex.*;

public class p_505 {
    public static void main(String[] args){
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c."};

        Pattern p = Pattern.compile("c[a-z]*");         // c로 시작하는 알파벳 단어

        for(int i = 0; i < data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches()){
                System.out.print(data[i] + ",");
            }
        }
    }
}
