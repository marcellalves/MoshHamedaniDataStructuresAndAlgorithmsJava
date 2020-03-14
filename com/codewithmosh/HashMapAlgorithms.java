package com.codewithmosh;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlgorithms {
  public void firstNonRepeatingCharacter(final String inputString) {
    final var result = getFirstNonRepeatingCharacter(inputString);
    System.out.println(result);
  }

  private char getFirstNonRepeatingCharacter(String input) {
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