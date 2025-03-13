/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.geometry;

/**
 *
 * @author felix
 */
public class Circle {
    private Point center;
    private double radius;
    
    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }
    
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public Point getCenter() {
        return this.center;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    // Distance between points = sqrt((x2 - x1)^2 + (y2 - y1)^2)
    public boolean contains(Point p) {
        
        double xDifferenceSquared = (p.getX() - this.center.getX()) * (p.getX() - this.center.getX());
        double yDifferenceSquared = (p.getY() - this.center.getY()) * (p.getY() - this.center.getY());
        
        double pointDistanceFromCenter = Math.sqrt(xDifferenceSquared + yDifferenceSquared);
        
        if (pointDistanceFromCenter > this.radius) {
            return false;
        }
        
        return true;
        
    }
    
    // if circles have any overlap return true
    // use euclidian distance again
    // if the euclidian distance between circle centers is less than the sum of their radii
    // return true
    public boolean contains (Circle c) {
        double distanceBetweenCenters = Math.sqrt(
                Math.pow((c.center.getX() - this.center.getX()), 2)
                +
                Math.pow((c.center.getY() - this.center.getY()), 2)
        );
        
        return distanceBetweenCenters <= c.getRadius() + this.radius;
    }
}
