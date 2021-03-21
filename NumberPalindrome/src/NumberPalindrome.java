public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int isNegative = number < 0 ? -1 : 1;
        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(Math.abs(number)));
        return Integer.parseInt(str.reverse().toString()) * (isNegative) == number;
    }
}
