import java.util.*;
import java.text.*;

public class p_545 {
    public static void main(String args[]){
        Date today = new Date();

        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(sdf.format(today));

        // Date 인스턴스만 format 메서드 사용 가능 calendar -> date
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 7, 5);
        Date day = cal.getTime();
        System.out.println(day);
    }
}
