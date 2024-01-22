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

}
