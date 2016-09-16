import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Word {
  private String mTerm;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;
  private List<Definition> mDefinitions;


  public Word(String term) {
    mTerm = term;
    instances.add(this);
    mId = instances.size();
    mDefinitions = new ArrayList<Definition>();
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

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }
}
