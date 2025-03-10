import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
  public static String reverseWords(String s) {
    List<String> res = Arrays.asList(s.trim().split("\\s+"));
    Collections.reverse(res);
    return String.join(" ", res);
  }
}
