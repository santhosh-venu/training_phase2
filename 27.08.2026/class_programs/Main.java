import java.util.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // put
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        
        // get
        System.out.println("Apple: " + map.get("Apple"));
        
        // keySet()
        System.out.println("Keys: " + map.keySet());
        
        // values()
        System.out.println("Values: " + map.values());
        
        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // containsKey
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana"));
        
        // remove
        map.remove("Orange");
        System.out.println("After removal: " + map);
    }
}


// public class Main {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
        
//         map.put("A", 1);
//         map.put("B", 2);
//         map.put("C", 3);
//         map.put("A", 100); // Replaces old value
        
//         System.out.println("HashMap: " + map);
        
//         // Null key and value
//         map.put(null, 999);
//         map.put("D", null);
        
//         System.out.println("With null: " + map);
//     }
// }



