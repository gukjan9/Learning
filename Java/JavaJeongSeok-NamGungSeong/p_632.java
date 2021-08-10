import java.util.*;

public class p_632 {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2", "1", "1", "2", "3", "3", "4", "6", "5"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);
        }

        System.out.println(set);            // [1, 1, 2, 3, 4, 5, 6] - 오름차순 자동정렬
                                            // 1과 new Integer(1)은 중복 처리 x
    }
}
