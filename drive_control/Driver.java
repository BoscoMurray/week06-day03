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

  public Drivable getVehicle() {
    return this.vehicle;
  }

  public void updateVehicle(Drivable vehicle) {
    this.vehicle = vehicle;
  }

  public int driveDistance(int distance) {
    return this.vehicle.driveDistance(distance);
  }

}