public class AtoiStringToInteger {
  public int myAtoi(String s) {
    int i = 0, len = s.length();
    int sign = 1;
    long res = 0;
    while (i < len && s.charAt(i) == ' ') {
      i++;
    }
    if (i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
      sign = (s.charAt(i) == '-') ? -1 : 1;
      i++;
    }
    while (i < len && Character.isDigit(s.charAt(i))) {
      res = res * 10 + (s.charAt(i) - '0');
      if (res * sign > Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
      }
      if (res * sign < Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
      }
      i++;
    }
    return (int) (res * sign);
  }
}
