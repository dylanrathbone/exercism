import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

    private LocalDate birthDate;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        LocalDateTime birthDateAndTime;
        if (birthDateTime != null) {
            LocalDate dateOfBirth = LocalDate.of(birthDateTime.getYear(), birthDateTime.getMonthValue(), birthDateTime.getDayOfMonth());
            LocalTime timeOfBirth = LocalTime.of(birthDateTime.getHour(), birthDateTime.getMinute(), birthDateTime.getSecond());
            birthDateAndTime = LocalDateTime.of(dateOfBirth, LocalTime.of(0, 0));
        } else {
            birthDateAndTime = LocalDateTime.of(birthDate, LocalTime.of(0, 0));
        }
        return birthDateAndTime.plusSeconds(1000000000);
    }

}
