import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
  public static void main(final String[] args) {
    final var inputString = "a green apple ";
    final var result = getFirstNonRepeatingCharacter(inputString);
    System.out.println(result);
  }

  private static char getFirstNonRepeatingCharacter(String input) {
    Map<Character, Integer> characterMapper = new HashMap<>();
    var chars = input.toCharArray();
    for (var c : chars) {
      var count = characterMapper.containsKey(c) ? characterMapper.get(c) : 0;
      characterMapper.put(c, count + 1);
    }

    for (var c : chars) {
      if (characterMapper.get(c) == 1)
        return c;
    }
    return Character.MIN_VALUE;
  }
}