public class RemoveOutermostParenthesis {
  public String removeOuterParentheses(String s) {
    StringBuilder res = new StringBuilder("");
    int openCounter = 0;
    int len = s.length();
    for (int i = 0; i < len; i++) {
      if (s.charAt(i) == '(') {
        if (openCounter > 0) {
          res.append('(');
        }
        openCounter++;
      } else {
        openCounter--;
        if (openCounter > 0) {
          res.append(')');
        }
      }
    }
    return String.valueOf(res);
  }
}
