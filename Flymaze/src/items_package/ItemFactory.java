// Demonstrating Flyweight pattern
package items_package;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
  
  private static Map<String, Item> itemCache = new HashMap<>();
  
  public static Item getItem(String type)
  {
    Item item = null;

    if (itemCache.containsKey(type))
        item = itemCache.get(type);
    else
    {
        switch(type)
        {
        case "Sword":
            System.out.println("\n New Sword Item Built");
            ItemBuilder swordBuilder = new SwordBuilder();
            ItemConstructor builder = new ItemConstructor(swordBuilder);
		    builder.constructItem();
		    item = builder.getItem();
            break;
        case "Potion":
            System.out.println("\n New Potion Item Built");
            ItemBuilder potionBuilder = new PotionBuilder();
            ItemConstructor builder2 = new ItemConstructor(potionBuilder);
            builder2.constructItem();
            item = builder2.getItem();
            break;
        default :
            System.out.println("Error caused by line 36 in class ItemFactory.java");
        }

        // Once created insert it into the HashMap
        itemCache.put(type, item);
    }
    System.out.print("\nCurrent Cache Storage: " + itemCache.size() + " Item(s)\n");
    return item;
  }
}
