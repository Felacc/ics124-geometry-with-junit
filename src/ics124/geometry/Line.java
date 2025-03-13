/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.geometry;

/**
 *
 * @author felix
 */
public class Line {
    private Point startPoint;
    private Point endPoint;
    
    public Line() {
        this(new Point(), new Point());
    }
    
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    public Point getStartPoint() {
        return this.startPoint;
    }
    
    public Point getEndPoint() {
        return this.endPoint;
    }
    
    // find euclidian distance
    public double length() {
        return this.startPoint.distanceTo(this.endPoint);
    }
    
    // distance from start point and distance from end point should equal line length if on line
    public boolean contains(Point p) {
        double d1 = p.distanceTo(this.startPoint); // distance from start
        double d2 = p.distanceTo(this.endPoint); //distance from end
        
        return (d1 + d2) == this.length();
    }
    
    
            
}
