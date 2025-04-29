import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        formatAndPrintDate(date);
    }

    static void formatAndPrintDate(LocalDate date) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + date.format(formatter1));
        System.out.println("Format 2: " + date.format(formatter2));
        System.out.println("Format 3: " + date.format(formatter3));
    }
}
