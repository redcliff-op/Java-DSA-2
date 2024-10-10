public class RemoveConsecutiveCharacters {
  public static String removeConsecutiveCharacter(String S) {
    StringBuffer res = new StringBuffer("");
    res.append(S.charAt(0));
    int len = S.length();
    for(int i=1;i<len;i++){
      if(S.charAt(i)==S.charAt(i-1)){
        continue;
      }
      res.append(S.charAt(i));
    }
    return res.toString();
  }
}
