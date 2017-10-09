import org.junit.Test;
import static org.junit.Assert.*;

public class CommandBuilderTest {
  @Test
  public void build() throws Exception {
    DataBase dataBase = new DataBase();
    CommandBuilder commandBuilder = new CommandBuilder(dataBase);
    assertEquals(new CountTypesCommand(dataBase).getName(), commandBuilder.build("1").getName());
  }
}
