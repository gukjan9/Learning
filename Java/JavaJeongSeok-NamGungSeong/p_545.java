import java.util.*;
import java.text.*;

public class p_545 {
    public static void main(String args[]){
        Date today = new Date();

        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(sdf.format(today));
    }
}
