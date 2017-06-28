import static org.junit.Assert.*;
import org.junit.*;
import drive_control.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before() {
    quadbike = new QuadBike(20, 50);
  }

  @Test
  public void canGetSpeed() {
    assertEquals(20, quadbike.getSpeed());
  }

  @Test
  public void canGetEngineSize() {
    assertEquals(50, quadbike.getEngineSize());
  }

  @Test
  public void calcTimeToDrive() {
    assertEquals(5, quadbike.driveDistance(100));
  }

}