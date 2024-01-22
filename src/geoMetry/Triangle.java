package geoMetry;

public class Triangle extends Shapes {
	
	Coordinate point1;
	Coordinate point2;
	Coordinate point3;
    double[] sideLengths;

    public Triangle(Coordinate point1, Coordinate point2, Coordinate point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.sideLengths = new double[] {
            calculateSide(point1, point2),
            calculateSide(point2, point3),
            calculateSide(point3, point1)
        };
    }

}
