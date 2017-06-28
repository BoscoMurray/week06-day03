import static org.junit.Assert.*;
import org.junit.*;
import drive_control.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemcar;
  QuadBike quadbike;

  @Before
  public void before() {
    driver = new Driver("Bosco", dodgemcar);
  }

  @Test
  public void canGetName() {
    assertEquals("Bosco", driver.getName());
  }

  @Test
  public void calcTimeToDrive() {
    assertEquals(10, driver.driveDistance(100));
  }

}