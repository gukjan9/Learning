import java.util.*;

public class p_514 {
    public static void main(String[] args){
        String source = "100,200,300,400,";
        StringTokenizer st = new StringTokenizer(source, ",");          // , 기준으로 문자열 자르기

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
