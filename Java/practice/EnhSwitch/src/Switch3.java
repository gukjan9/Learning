import static java.util.Calendar.*;

public class Switch3 {
    public static void main(String[] args) {
        Integer day = 1000;
        int numCnt = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> {
                int result = day.toString().length();
                yield result;
            }
        };
        System.out.println(numCnt);
    }
}