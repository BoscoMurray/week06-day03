package drive_control;
import behaviours.*;

public class QuadBike implements Drivable {
  int speed;
  int engine;

  public QuadBike(int speed, int engine) {
    this.speed = speed;
    this.engine = engine;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int getEngineSize() {
    return this.engine;
  }

  public int driveDistance(int distance) {
    int time = distance / this.speed;
    return time;
  }

}