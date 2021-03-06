import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    assertTrue(testDefinition instanceof Definition);
  }

  @Test
  public void Definition_getsMeaning_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    assertEquals("A city in Oregon", testDefinition.getMeaning());
  }

  @Test
  public void all_returnsAllInstancesOfDefinitions_true() {
    Definition testDefinition = new Definition( "A city in Oregon");
    Definition nextDefinition = new Definition( "A super cool island");
    assertEquals(true, Definition.all().contains(testDefinition));
    assertEquals(true, Definition.all().contains(nextDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList_0() {
    Definition testDefinition = new Definition( "A city in Oregon");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void getId_DefinitionsInstantiateWithAnID_1() {
    Definition.clear();
    Definition testDefinition = new Definition( "A city in Oregon");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_nextDefinition() {
    Definition testDefinition = new Definition( "A city in Oregon");
    Definition nextDefinition = new Definition( "A super cool island");
    assertEquals(Definition.find(nextDefinition.getId()), nextDefinition);
  }

}
