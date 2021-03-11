public class isLeapYear {
    public static boolean isLeapYear(int year ) {

        int divBy4 = year % 4;
        int divBy100 =year % 100;
        int divBy400=year % 400;
        boolean isLeap = false; //store if the year is Leap or not
        if  ( (divBy4 == 0) && (year > 0) && (year < 9999)) {
            if (divBy100 == 0) {

                if (divBy400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }
}
