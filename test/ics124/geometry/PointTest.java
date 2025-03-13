/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.geometry;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felix
 */
public class PointTest {

    public PointTest() {
    }

    @Test
    public void testDefaultAtOrigin() {
        Point p = new Point();
        double x = p.getX();
        double y = p.getY();
        double delta = 0.0;
        assertEquals(0.0, x, delta);
        assertEquals(0.0, y, delta);
    }

    @Test
    public void testCreateArbitraryPoint() {
        double x = 3.0;
        double y = 4.0;
        double delta = 0.0;

        Point p = new Point(x, y);

        assertEquals(x, p.getX(), delta);
        assertEquals(y, p.getY(), delta);
    }

    @Test
    public void testDistance() {
        double x = 3.0;
        double y = 4.0;
        double delta = 0.0;

        Point origin = new Point();
        Point p = new Point(x, y);

        double expectedDistance = 5.0;

        assertEquals(expectedDistance, p.distanceTo(origin), delta);
        assertEquals(expectedDistance, origin.distanceTo(x, y), delta);
    }

}
