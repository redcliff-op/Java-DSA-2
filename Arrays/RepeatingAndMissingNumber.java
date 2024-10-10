import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RepeatingAndMissingNumber {
  public static ArrayList<Integer> repeatedNumber(List<Integer> A) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int repeated = -1, missing = -1;
    int len = A.size();
    for (int i = 1; i <= len; i++) {
      map.put(i, 0);
    }
    for (int i = 0; i < len; i++) {
      int currentNum = A.get(i);
      map.put(currentNum, map.get(currentNum) + 1);
    }
    for (int i = 1; i <= len; i++) {
      int count = map.get(i);
      if (count == 2) {
        repeated = i; 
      } else if (count == 0) {
        missing = i;
      }
    }
    return new ArrayList<>(Arrays.asList(repeated, missing));
  }
}
