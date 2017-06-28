package drive_control;
import behaviours.*;

public class DodgemCar implements Drivable {
  int speed;
  int seats;

  public DodgemCar(int speed, int seats) {
    this.speed = speed;
    this.seats = seats;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int getSeats() {
    return this.seats;
  }

  public int driveDistance(int distance) {
    int time = distance / this.speed;
    return time;
  }



}