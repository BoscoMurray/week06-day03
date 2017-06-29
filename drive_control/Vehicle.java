package drive_control;

public abstract class Vehicle {
  int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

}