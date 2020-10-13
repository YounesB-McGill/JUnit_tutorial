package ca.mcgill.ecse211.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ca.mcgill.ecse211.project.Point;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestPoint {

  /** Tests Point.makePointsFromString(). */
  @Test void testMakePointsFromString() {
    // TODO Test usual case
    var expected = List.of(p(1, 2));
    var actual = Point.makePointsFromString("(1, 2)");
    assertEquals(expected, actual);
    
    expected = List.of(p(1, 2), p(2.5, 7.5), p(-7, -6.0));
    actual = Point.makePointsFromString("(1, 2), (2.5, 7.5), (-7, -6.0)");
    assertEquals(expected, actual);

    // TODO Test edge cases
  }
  
  /** Helper method to create a Point. */
  private static Point p(double x, double y) {
    return new Point(x, y);
  }

}
