import static org.junit.Assert.*;
import org.junit.*;
import drive_control.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemcar;
  QuadBike quadbike;

  @Before
  public void before() {
    dodgemcar = new DodgemCar(10, 2);
    driver = new Driver("Bosco", dodgemcar);
  }

  @Test
  public void canGetName() {
    assertEquals("Bosco", driver.getName());
  }

  @Test
  public void canGetVehicle() {
    assertEquals(dodgemcar, driver.getVehicle());
  }

  @Test
  public void calcTimeToDrive() {
    assertEquals(10, driver.driveDistance(100));
  }

  @Test
  public void canUpdateVehicle() {
    quadbike = new QuadBike(20, 50);
    driver.updateVehicle(quadbike);
  }

}