

/*1)Write a method called toMilesPerHour that has 1 parameter double.This return rounded value of calculation type long
2)printConversion with 1 parameter double (km/h) .Calculate milesPerHour and display conversion

 note 1 mile per hour is 1.609 kilometres per hour*/



public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < = 0) {
            return -1;
        } else {
            double average = (double) kilometersPerHour / 1.609;
            return Math.round(average);
        }

    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " Km '/'h = " + milesPerHour + " mi'/'h");
    }

}
