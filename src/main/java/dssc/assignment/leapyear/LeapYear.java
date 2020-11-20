package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }


    public boolean isLeap(int year) {
        if(year % 4 != 0){
            return false;
        } else {
            return true;
        }
    }
}
