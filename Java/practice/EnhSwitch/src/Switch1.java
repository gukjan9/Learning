import static java.util.Calendar.*;

public class Switch1 {
    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY                -> System.out.println(7);
            case THURSDAY, SATURDAY     -> System.out.println(8);
            case WEDNESDAY              -> System.out.println(9);
        }

    }
}