package lt.timoras.toDo;


public class ConversionToRomanNumbers {

    private static final int[]    VALUES  = {1000, 900, 500, 400,  100,  90,  50,  40,   10,   9,    5,   4,    1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String getRomanNumberFromSequanceAtIndex(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for(int i = 0; i < VALUES.length; i++){
            remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i], result);
        }
//        System.out.println(number +"  - "+ result.toString());
        return result.toString();
    }

    public static int appendRomanNumerals(int number, int value, String romanDigits, StringBuilder builder) {
        int result = number;
        while (result >= value) {
            builder.append(romanDigits);
            result -= value;
        }
        return  result;
    }
}
