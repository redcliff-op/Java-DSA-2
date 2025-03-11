public class MaximumNestingDepth {
  public int maxDepth(String s) {
    int len = s.length();
    int max = 0;
    int depth = 0;
    for(int i=0;i<len;i++){
      if(s.charAt(i)=='('){
        depth++;
        if(depth>max){
          max = depth;
        }
      }else if (s.charAt(i) == ')') {
        depth--;
      }
    }
    return max;
  }
}
