package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year_Test {

    private final LeapYear year = new LeapYear();

    @ParameterizedTest
    @CsvSource({"2000, true", "1900, true", "2012, true"})
    void leap_year_value_true(int number, boolean expected){
        assertEquals(expected, year.isLeap(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1927, 2001, 2019})
    void leap_year_value_false(int number){
        assertEquals(false, year.isLeap(number));
    }

    @Test
    void not_leap_year_1100() {
        assertEquals(false, year.isLeap(1100));
    }

    @Test
    void not_leap_year_2200() {
        assertEquals(false, year.isLeap(2200));
    }

    @Test
    void not_leap_year_1500() {
        assertEquals(false, year.isLeap(1500));
    }
}
