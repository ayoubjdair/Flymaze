// Demonstrating Flyweight pattern
package items_package;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
  
  private Map<String, Item> itemCache = new HashMap<>();
  
  public Item getItem(String type)
  {
    Item item = null;

    if (itemCache.containsKey(type))
        item = itemCache.get(type);
    else
    {
        switch(type)
        {
        case "Sword":
            System.out.println("Sword Item Built");
            ItemBuilder swordBuilder = new SwordBuilder();
            ItemConstructor builder = new ItemConstructor(swordBuilder);
		    builder.constructItem();
		    item = builder.getItem();
            break;
        case "Potion":
            System.out.println("Potion Item Built");
            ItemBuilder potionBuilder = new PotionBuilder();
            ItemConstructor builder2 = new ItemConstructor(potionBuilder);
            builder2.constructItem();
            item = builder2.getItem();
            break;
        default :
            System.out.println("Error caused by line 35 in class ItemFactory.java");
        }

        // Once created insert it into the HashMap
        itemCache.put(type, item);
    }
    return item;
  }
}
