import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word newWord = new Word("Portland");
    assertEquals(true, newWord instanceof Word);
  }

  @Test
  public void word_instantiatesWithTerm_true() {
    Word newWord = new Word("Portland");
    assertEquals("Portland", newWord.getTerm());
  }

  @Test
  public void all_returnsAllInstancesOfTerm_true() {
    Word newWord = new Word("Portland");
    Word nextWord = new Word("Trinidad");
    assertEquals(true, Word.all().contains(newWord));
    assertEquals(true, Word.all().contains(nextWord));
  }


}
