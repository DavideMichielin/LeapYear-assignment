package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year_Test {
    @Test
    void leap_year_2000() {
        LeapYear year = new LeapYear();
        assertEquals(true, year.isLeap(2000));
    }

    @Test
    void leap_year_1900() {
        LeapYear year = new LeapYear();
        assertEquals(true, year.isLeap(1900));
    }
}
