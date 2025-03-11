import java.util.ArrayList;
import java.util.List;

public class SortByFrequency {
  public String frequencySort(String s) {
    int count[] = new int[128];
    StringBuilder res = new StringBuilder("");
    List<Character> charList = new ArrayList<Character>();
    for(char elem: s.toCharArray()){
      count[elem]++;
    }
    for (int i = 0; i < 128; i++) {
      if (count[i] > 0) {
        charList.add((char) i);
      }
    }
    charList.sort((a,b) -> count[b] - count[a]);
    for (char c : charList) {
      for (int i = 0; i < count[c]; i++) {
        res.append(c);
      }
    }
    return res.toString();
  }
}
