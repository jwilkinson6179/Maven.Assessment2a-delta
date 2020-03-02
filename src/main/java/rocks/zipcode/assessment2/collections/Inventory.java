package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory
{
    Map<String, Integer> stock;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings)
    {
        stock = new HashMap<String, Integer>();

        for(String item : strings)
        {
            if(stock.containsKey(item))
            {
                Integer numberInStock = stock.get(item);
                stock.put(item, numberInStock + 1);
            }
            else
            {
                stock.put(item, 1);
            }
        }
    }

    /**
     * nullary constructor initializes a new list
     */

    // TODO: Constructor chaining
    public Inventory()
    {
        stock = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(stock.containsKey(item))
        {
            Integer numberInStock = stock.get(item);
            stock.put(item, numberInStock + 1);
        }
        else
        {
            stock.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(stock.containsKey(item))
        {
            Integer numberInStock = stock.get(item);
            stock.put(item, numberInStock - 1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(stock.containsKey(item))
        {
            return stock.get(item);
        }
        else
        {
            return 0;
        }
    }
}
