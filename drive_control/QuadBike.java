package drive_control;
import behaviours.*;

public class QuadBike extends Vehicle implements Drivable {
  int engine;

  public QuadBike(int speed, int engine) {
    super(speed);
    this.engine = engine;
  }

  public int getEngineSize() {
    return this.engine;
  }

  public int driveDistance(int distance) {
    return distance / this.speed;
  }

}