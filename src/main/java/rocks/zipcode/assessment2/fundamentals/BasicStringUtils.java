package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2)
    {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1)
    {
        StringBuilder reversed = new StringBuilder();

        for(Integer i = string1.length() - 1; i >= 0; i--)
        {
            reversed.append(string1.charAt(i));
        }

        return reversed.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        return reverse(string1) + reverse(string2);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove)
    {
        StringBuilder result = new StringBuilder();
        char[] charsToRemove = charactersToRemove.toCharArray();

        for(Integer i = 0; i < string.length(); i++)
        {
            Boolean charToBeAdded = true;

            for(Integer k = 0; k < charsToRemove.length; k++)
            {
                if(string.charAt(i) == charsToRemove[k])
                {
                    charToBeAdded = false;
                }
            }

            if(charToBeAdded)
            {
                result.append(string.charAt(i));
            }
        }

        return result.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        return reverse(removeCharacters(string, charactersToRemove));
    }
}
