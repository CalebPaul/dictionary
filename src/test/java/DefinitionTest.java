import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    assertTrue(testDefinition instanceof Definition);
  }

  public void Definition_getsMeaning_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    assertEquals("A city in Oregon", testDefinition.getMeaning());
  }

  public void all_returnsAllInstancesOfDefinitions_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    Definition nextDefinition = new Definition( "A city in Trinidad");
    assertEquals(true, Definition.all().contains(testDefinition));
    assertEquals(true, Definition.all().contains(nextDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList_0() {
    Definition testDefinition = new Definition( "A city in Oregon");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

}
