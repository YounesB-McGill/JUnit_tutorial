package ca.mcgill.ecse211.project;

/** Main class. This class uses the logic in the Point class. */
public class Main {

  /** Main entry point. */
  public static void main(String[] args) {
    var points = Point.makePointsFromString("(1, 1), (2.5, 3), (-4, 8.25)");

    for (var point: points) {
      System.out.println("Traveling to point with x = " + point.x + " ft and y = " + point.y + ".");
    }
  }

}
