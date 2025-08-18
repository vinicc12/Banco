package sistemaBancario.domain.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    private static final DateTimeFormatter DATE_TIME_FORMATER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMATER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static String currentTimeAndDate(){
        return DATE_TIME_FORMATER.format(LocalDateTime.now());
    }

    public static String currentDate(){
        return DATE_FORMATER.format(LocalDate.now());
    }

    public static String currentTime(){
        return TIME_FORMATER.format(LocalTime.now());
    }
}
