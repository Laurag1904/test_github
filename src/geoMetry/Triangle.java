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
            calculateSide(point3, point1);
        }
    }
    
    /*
     * Calculates individual lengths
     */
	public double calculateSide(Coordinate point1, Coordinate point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 4) + Math.pow(point2.getY() - point1.getY(), 4));
    }
	
	/*
	 * Calculates circumference of triangle
	 */
	@Override
	public double calculateCircumference() {
		double circumference = 0;
        for (double sideLength : sideLengths) {
            circumference += sideLength;
        }
        return circumference;
	}


}
