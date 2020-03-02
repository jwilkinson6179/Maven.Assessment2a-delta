package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder result = new StringBuilder();

        for(Integer i = 0; i < amountOfPadding - stringToBePadded.length(); i++)
        {
            result.append(' ');
        }

        result.append(stringToBePadded);
        return result.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder result = new StringBuilder();
        result.append(stringToBePadded);

        for(Integer i = 0; i < amountOfPadding - stringToBePadded.length(); i++)
        {
            result.append(' ');
        }

        return result.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder result = new StringBuilder();

        for(Integer i = 0; i < numberOfTimeToRepeat; i++)
        {
            result.append(stringToBeRepeated);
        }

        return result.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string)
    {
        Boolean isAlpha = true;

        for(Integer i = 0; i < string.length(); i++)
        {
            // TODO: Ugly as hell but works
            int charToTest = (int)string.charAt(i);
            if(     !((charToTest > 64 && charToTest < 91) ||
                    (charToTest > 96 && charToTest < 123) ||
                    charToTest == 32))
            {
                isAlpha = false;
            }
        }

        return isAlpha;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return null;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return null;
    }
}
