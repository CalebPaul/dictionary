import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    assertTrue(testDefinition instanceof Definition); 
  }