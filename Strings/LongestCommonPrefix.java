public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    String res = strs[0];
    int len = strs.length;
    for (int i = 1; i < len; i++) {
      for (int j = 0; j < res.length(); j++) {
        if (j >= strs[i].length() || strs[i].charAt(j) != res.charAt(j)) {
          res = res.substring(0, j);
        }
      }
    }
    return res;
  }
}
