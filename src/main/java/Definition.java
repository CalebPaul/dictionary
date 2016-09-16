import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Definition {
  private String mMeaning;
  private static List<Definition> instances = new ArrayList<Definition>();

  public Definition(String meaning) {
  mMeaning = meaning;
  instances.add(this);
  }

  public String getMeaning() {
    return mMeaning;
  }

  public static List<Definition> all() {
    return instances;
  }



}
