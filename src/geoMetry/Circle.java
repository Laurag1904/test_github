package geoMetry;

public class Circle extends Shapes{
	
	Coordinate middle;
	Coordinate radiusPoint;
	double radius;
	
	public Circle(Coordinate middle, Coordinate radiusPoint) {
		super();
		this.middle = middle;
		this.radiusPoint = radiusPoint;
	}
	
	public Coordinate getMiddle() {
		return middle;
	}

	public void setMiddle(Coordinate middle) {
		this.middle = middle;
	}

	public Coordinate getRadiusPoint() {
		return radiusPoint;
	}

	public void setRadiusPoint(Coordinate radiusPoint) {
		this.radiusPoint = radiusPoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	/*
	 * Calculates radius of circle
	 */
	public double calculateRadius(Coordinate middle, Coordinate radiusPoint) {
        double radius = Math.sqrt(Math.pow(radiusPoint.getX() - middle.getX(), 2) +
					Math.pow(radiusPoint.getY() - middle.getY(), 2));
        return radius;
    }

}
