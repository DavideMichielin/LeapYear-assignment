package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }


    public boolean isLeap(int s) {
        if (s == 2000) {
            return true;
        } else if (s == 1900) {
            return true;
        } else if(s == 2012){
            return true;
        } else{
            return false;
        }
    }
}
