package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] addedToArray = new Integer[integerArray.length + 1];

        for(Integer i = 0; i < integerArray.length; i++)
        {
            addedToArray[i] = integerArray[i];
        }

        addedToArray[integerArray.length] = valueToBeAdded;

        return addedToArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted)
    {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch)
    {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] output = new Integer[integerArray.length];

        for(Integer i = 0; i < integerArray.length; i++)
        {
            if(integerArray[i] % 2 == 0)
            {
                output[i] = integerArray[i] + 1;
            }
            else
            {
                output[i] = integerArray[i] - 1;
            }
        }

        return output;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] output = new Integer[integerArray.length];

        for(Integer i = 0; i < integerArray.length; i++)
        {
            if(integerArray[i] % 2 == 0)
            {
                output[i] = integerArray[i] + 1;
            }
            else
            {
                output[i] = integerArray[i];
            }
        }

        return output;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] output = new Integer[input.length];

        for(Integer i = 0; i < input.length; i++)
        {
            if(input[i] % 2 != 0)
            {
                output[i] = input[i] - 1;
            }
            else
            {
                output[i] = input[i];
            }
        }

        return output;
    }
}
