public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int freq[] = new int[128];
    for (char elem : s.toCharArray()) {
      freq[elem]++;
    }
    for (char elem : t.toCharArray()) {
      freq[elem]--;
      if (freq[elem] < 0) {
        return false;
      }
    }
    return true;
  }
}
