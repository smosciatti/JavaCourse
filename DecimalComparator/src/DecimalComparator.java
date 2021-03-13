import java.math.RoundingMode;
import java.text.DecimalFormat;


    public class DecimalComparator{

        public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){

            DecimalFormat df = new DecimalFormat("#.000");
            df.setRoundingMode(RoundingMode.DOWN);
            boolean returned;
            returned = (df.format(firstNumber).equals(df.format(secondNumber)))? true:  false;

           /* if (df.format(firstNumber).equals(df.format(secondNumber))) {
                return true;
            }
            else {
                return false;
            }*/
           return returned;
        }
    }

