import static org.junit.Assert.*;
import org.junit.*;
import drive_control.*;

public class DodgemCarTest {

  DodgemCar dodgemcar;

  @Before
  public void before() {
    dodgemcar = new DodgemCar(10, 2);
  }

  @Test
  public void canGetSpeed() {
    assertEquals(10, dodgemcar.getSpeed());
  }

  @Test
  public void canGetSeats() {
    assertEquals(2, dodgemcar.getSeats());
  }

}