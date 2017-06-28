package drive_control;
import behaviours.*;

public class Driver implements Drivable {
  String name;
  private Drivable vehicle;

  public Driver(String name, Drivable vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName() {
    return this.name;
  }

  public int driveDistance(int distance) {
    int time = this.vehicle.driveDistance(distance);
    return time;
  }

}