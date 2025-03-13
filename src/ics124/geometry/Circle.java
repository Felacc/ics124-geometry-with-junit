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
        double distanceFromCenter = this.center.distanceTo(p);
        
        if (distanceFromCenter > this.radius) {
            return false;
        }
        
        return true;
        
    }
    
    // if circles have any overlap return true
    // use euclidian distance again
    // if the euclidian distance between circle centers is less than the sum of their radii
    // return true
    public boolean contains (Circle c) {
        double distanceBetweenCenters = this.center.distanceTo(c.getCenter());
        return distanceBetweenCenters <= c.getRadius() + this.radius;
    }
}
