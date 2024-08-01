import static java.util.Calendar.*;

public class Switch2 {
    public static void main(String[] args) {
        int day = 1;
        int numCnt = switch (day) {
            case MONDAY, FRIDAY, SUNDAY	-> 6;
            case TUESDAY				-> 7;
            case THURSDAY, SATURDAY		-> 8;
            case WEDNESDAY				-> 9;
            default -> -1;
        };

        System.out.println(numCnt);
    }
}
