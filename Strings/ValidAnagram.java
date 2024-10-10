
import java.util.HashMap;

public class ValidAnagram {
  public static boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> sHash = new HashMap<Character, Integer>();
    HashMap<Character, Integer> tHash = new HashMap<Character, Integer>();
    int sLen = s.length();
    int tLen = t.length();
    if (sLen != tLen) {
      return false;
    }
    for (int i = 0; i < sLen; i++) {
      sHash.put(s.charAt(i), sHash.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < tLen; i++) {
      tHash.put(t.charAt(i), tHash.getOrDefault(t.charAt(i), 0) + 1);
    }
    return sHash.equals(tHash);
  }
}
