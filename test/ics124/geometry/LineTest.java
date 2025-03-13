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
public class LineTest {
    
    public LineTest() {
    }

    @Test
    public void testDefaultStartAndEndPoints() {
        Line l = new Line();
        double delta = 0;
        Point start = l.getStartPoint();
        Point end = l.getEndPoint();
        
        assertEquals(0 , start.getX(), delta);
        assertEquals(0 , start.getY(), delta);
        assertEquals(0, end.getX(), delta);
        assertEquals(0, end.getY(), delta);
    }
    
    @Test
    public void testDefaultLineLength() {
        Line l = new Line();
        double delta = 0;
        double length = l.length();
        
        assertEquals(0, length, delta);
    }
    
    @Test 
    public void testArbitraryLineLength() {
        Point start = new Point(1,1);
        Point end = new Point(1, 7);
        Line l = new Line(start, end);
        
        assertEquals(6, l.length(), 0);
    }
    
    
    
}
