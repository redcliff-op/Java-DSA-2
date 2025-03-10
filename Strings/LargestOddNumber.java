package Strings;

public class LargestOddNumber {
  public String largestOddNumber(String num) {
    int len = num.length();
    for(int i = len-1;i>=0;i--){
      if((int)num.charAt(i)%2!=0){
        return num.substring(0,i+1);
      }
    }
    return "";
  }
}
