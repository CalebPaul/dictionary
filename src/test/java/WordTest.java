import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

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

  @Test
  public void clear_emptiesAllWordsFromList_true() {
    Word newWord = new Word("Portland");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Word newWord = new Word("Portland");
    assertEquals(1, newWord.getId());
  }


  @Test
  public void getId_returnsWordWithSameId_nextWord() {
    Word newWord = new Word("Portland");
    Word nextWord = new Word("Trinidad");
    assertEquals(Word.find(nextWord.getId()), nextWord);
  }



}
