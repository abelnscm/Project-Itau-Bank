package itau_bank.utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    // Attributes
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

    // Methods
    public static String now() {
        return LocalDateTime.now().format(formatter);
    }

}
