package geoMetry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


	private public class Group {
	    private ArrayList<Shapes> shapes = new ArrayList<>();

	    public void addShape(Shapes shape) {
	        shapes.add(shape);
	    }

	    public void removeShape(Shapes shape) {
	        shapes.remove(shape);
	    }

	    public double totalArea() {
	        double totalArea = 0;
	        Set<Shapes> seenShapes = new HashSet<>();

	
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
                totalPerimeter += shape.calculateArea();
                seenShapes.add(shape);
            }
        }

        return totalPerimeter;
    }
}


