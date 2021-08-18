import java.time.DayOfWeek;
import java.time.LocalDate;

//https://projecteuler.net/problem=19
public class Sundays {
    public int calculate() {
        LocalDate date = LocalDate.of(1899, 12, 31);
        LocalDate endDate = LocalDate.of(2000, 1, 1);
        int rez = 0;
        do {
            date = date.plusDays(7);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY && date.getDayOfMonth() == 1) {
                rez++;
            }

        } while (date.isBefore(endDate));
        return rez;
    }
}
