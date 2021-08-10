import java.util.*;

public class p_641 {
    public static void main(String[] args){
        Set set = new TreeSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

        System.out.println("Init : " + set);            // [자동 정렬돼서 출력]

        System.out.println("Above 50 : " + set.headSet(new Integer(50)));
        System.out.println("Below 50 : " + set.tailSet(new Integer(50)));
    }
}
