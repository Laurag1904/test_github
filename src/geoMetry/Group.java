package geoMetry;

import java.util.HashSet;
import java.util.Set;

public class Group {
	
	private class Group {
	    private ArrayList<Shape> shapes = new ArrayList<>();

	    public void addShape(Shape shape) {
	        shapes.add(shape);
	    }

	    public void removeShape(Shape shape) {
	        shapes.remove(shape);
	    }

	    public double totalArea() {
	        double totalArea = 0;
	        Set<Shape> seenShapes = new HashSet<>();

	
	    }
	}
	
	public double calculateTotalArea() {
        double totalArea = 0;
        Set<Shapes> seenShapes = new HashSet<>();
        for (Shapes shape : Shapes) {
            if (!seenShapes.contains(shape)) {
                totalArea += shape.calculateArea();
                seenShapes.add(shape);
            }
        }
        return totalArea;
    }
	
	public double calculateTotalPerimeter() {
        double totalPerimeter = 0;
        Set<Shapes> seenShapes = new HashSet<>();

        for (Shapes shape : shapes) {
            if (!seenShapes.contains(shape)) {
                totalPerimeter += shape.calculatePerimeter();
                seenShapes.add(shape);
            }
        }

        return totalPerimeter;
    }
}


