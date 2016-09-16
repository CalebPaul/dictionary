import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Word {
  private String mTerm;
  private static List<Word> instances = new ArrayList<Word>();


  public Word(String term) {
    mTerm = term;
    instances.add(this);
  }

  public String getTerm() {
    return mTerm;
  }

  public static List<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
