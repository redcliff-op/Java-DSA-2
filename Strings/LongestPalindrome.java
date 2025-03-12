public class LongestPalindrome {
  public String longestPalindrome(String s) {
    String res = "";
    int len = s.length();
    for (int i = 0; i < len; i++) {
      StringBuilder temp = new StringBuilder();
      temp.append(s.charAt(i));
      int l = i - 1;
      while (i + 1 < len && s.charAt(i) == s.charAt(i + 1)) {
        temp.append(s.charAt(i + 1));
        i++;
      }
      int r = i + 1;
      while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
        temp.insert(0, s.charAt(l));
        temp.append(s.charAt(r));
        l--;
        r++;
      }
      if (temp.length() > res.length()) {
        res = temp.toString();
      }
    }
    return res;
  }
}
