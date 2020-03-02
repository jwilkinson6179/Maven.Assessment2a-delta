package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<String, Integer> monthsToInteger;

    public MonthConversion()
    {
        monthsToInteger = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName)
    {
        monthsToInteger.putIfAbsent(monthName, monthNumber);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber)
    {
        for(Map.Entry<String, Integer> entry : monthsToInteger.entrySet())
        {
            if(entry.getValue() == monthNumber)
            {
                return entry.getKey();
            }
        }

        return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName)
    {
        // TODO: Figure this out.  How to return a null for int?  Changed to Integer but not sure if that's allowed
        if(!monthsToInteger.containsKey(monthName))
        {
            return (Integer)null;
        }
        else
        {
            return monthsToInteger.get(monthName);
        }
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber)
    {
        return monthsToInteger.containsValue(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName)
    {
        return monthsToInteger.containsKey(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthsToInteger.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName)
    {
        monthsToInteger.put(monthName, monthNumber);
    }
}
