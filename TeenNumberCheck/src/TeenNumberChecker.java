/*Write a method hasTeen with 3 parameters int
        this should return boolean
        true if one is in range 13-19*/


public class TeenNumberChecker {

    public static boolean hasTeen(int n1, int n2, int n3) {

        return (isTeen(n1) || isTeen(n2) || isTeen(n3));

    }

    public static boolean isTeen(int n1) {

        return (n1 >= 13 && n1 <= 19);

    }


}
