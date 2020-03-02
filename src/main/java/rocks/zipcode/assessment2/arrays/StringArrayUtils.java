package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] subString = new String[endingIndex - startingIndex];
        Integer subIdx = 0;


        for(Integer i = startingIndex; i < endingIndex; i++)
        {
            try {
                subString[subIdx] = arrayToBeSpliced[i];
            } catch (Exception e)
            {

            }
            subIdx++;
        }

        return subString;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        return getSubArray(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
    }
}
