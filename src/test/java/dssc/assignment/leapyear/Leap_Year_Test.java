package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year_Test {
    @Test
    void leap_year() {
        LeapYear year = new LeapYear();
        assertEquals(true, year.isLeap(2000));
    }
}
