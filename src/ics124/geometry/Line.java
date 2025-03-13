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
        return Math.sqrt(
        Math.pow(endPoint.getX() - startPoint.getX(), 2)
                +
        Math.pow(endPoint.getY() - startPoint.getY(), 2)
        );
    }
    
    
            
}
