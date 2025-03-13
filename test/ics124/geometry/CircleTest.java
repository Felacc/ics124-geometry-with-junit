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
public class CircleTest {
    
    public CircleTest() {
    }

    @Test
    public void testDefaultCircleCenterAtOrigin() {
        Circle c = new Circle();
        Point origin = new Point(0, 0); 
        double delta = 0;
        
        
        assertEquals(origin.getX(), c.getCenter().getX(), delta);
        assertEquals(origin.getY(), c.getCenter().getY(), delta);
    }
    
    @Test
    public void testDefaultCircleRadius() {
        Circle c = new Circle();
        double radius = 1;
        double delta = 0;
        
        assertEquals(radius, c.getRadius(), delta);
    }
    
    @Test 
    public void testConstructorWithParameters() {
        Point center = new Point(4, 7);
        double radius = 12.3;
        double delta = 0;
        
        Circle c = new Circle(center, radius);
        
        assertEquals(4, c.getCenter().getX(), delta);
        assertEquals(7, c.getCenter().getY(), delta);
        
        assertEquals(12.3, c.getRadius(), delta);
    }
    
    @Test
    public void testCircleHasArbitraryPoint() {
        Point p = new Point(1, 4);
        Circle c = new Circle(new Point (), 5);
        
        
        boolean containsPoint = c.contains(p);
        
        assertEquals(true, containsPoint);
    }
    
    
}
