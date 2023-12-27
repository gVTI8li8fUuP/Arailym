package models;

public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double x, double y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public double calculateDistanceTo(Point otherPoint) {
        double deltaX = this.xCoordinate - otherPoint.xCoordinate;
        double deltaY = this.yCoordinate - otherPoint.yCoordinate;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
