package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year_Test {
    @ParameterizedTest
    @CsvSource({"2000, true", "1900, true", "2012, true"})
    void leap_year_value_true(int number, boolean expected) {
        LeapYear year = new LeapYear();
        assertEquals(expected, year.isLeap(number));
    }

    @Test
    void not_leap_year_1927() {
        LeapYear year = new LeapYear();
        assertEquals(false, year.isLeap(1927));
    }
}
