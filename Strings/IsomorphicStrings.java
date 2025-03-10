public class IsomorphicStrings {
  public boolean isIsomorphic(String str1, String str2) {
    int m1[] = new int[128];
    int m2[] = new int[128];
    char[] a1 = str1.toCharArray();
    char[] a2 = str2.toCharArray();
    int index = 0;
    for (char char1 : a1) {
      char char2 = a2[index++];
      if (m1[char1] != m2[char2]) {
        return false;
      }
      m1[char1] = index + 1;
      m2[char2] = index + 1;
    }
    return true;
  }
}
