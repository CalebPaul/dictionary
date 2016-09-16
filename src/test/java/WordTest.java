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


}
