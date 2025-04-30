import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1); // Example date
        LocalDate result = performDateArithmetic(date);
        System.out.println("Final Date: " + result);
    }

    static LocalDate performDateArithmetic(LocalDate date) {
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
        result = result.minusWeeks(3);
        return result;
    }
}
