package itau_bank.system.backend.utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DATE_TIME {
    // Attributes
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

    // Methods
    public static String NOW() {
        return LocalDateTime.now().format(FORMATTER);
    }

}
