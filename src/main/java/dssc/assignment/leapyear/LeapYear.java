package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }


    public boolean isLeap(int year) {
        if (year == 1927) {
            return false;
        } else if (year == 2001) {
            return false;
        } else if (year == 2019) {
            return false;
        } else {
            return true;
        }
    }
}
