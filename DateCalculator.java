import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;

public class DateCalculator {
    private static LocalDate firstDate, secondDate;
    private static final String ERRR_MSG = "Invalid input parameters";

    public static void main(String args[]) {
        if (isValidInput(args))
            System.out.println((Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate)) == 0) ? 0
                    : Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate)) - 1);
    }

    private static Boolean isValidInput(String params[]) {
        if (params.length == 2) {
            try {
                firstDate = LocalDate.parse(params[0]);
                secondDate = LocalDate.parse(params[1]);
                return Boolean.TRUE;
            } catch (DateTimeParseException e) {
                System.err.println(ERRR_MSG);
            }
        } else {
            System.err.println(ERRR_MSG);
        }
        return Boolean.FALSE;
    }
}
