import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Mosh");
    map.put(2, "John");
    map.put(3, "Mary");
    map.put(3, "Marcell");
    map.put(4, null);
    map.put(null, null);
    map.remove(null);
    var value = map.get(3);
    map.containsKey(3); // O(1)
    map.containsValue("Mosh"); // O(n)

    System.out.println(value);
    System.out.println(map);

    for (var item : map.keySet())
      System.out.println(item);

    for (var item : map.entrySet()) {
      System.out.println(item);
      System.out.println(item.getKey());
      System.out.println(item.getValue());
    }
  }
}