package geoMetry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


	 public class Group {
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
			return totalArea;

	
	    }
	
	
	public double calculateTotalArea() {
        double totalArea = 0;
        Set<Shapes> seenShapes = new HashSet<>();
        for (Shapes shape : seenShapes) {
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
	
	public Shapes largestShapes(){
		double maxArea = 0.0;
		
		for (Shapes shape : shapes) {
            double area = shape.calculateArea();
            if( area >= maxArea ) {
            	maxArea = area;
            }
        }
		return null; 
	
	}
	

	
	public void printAllShapes() {
		if (shapes.isEmpty()) {
            System.out.println("Die Gruppe enthält keine Formen.");
        } else {
        	 System.out.println("Formen in der Gruppe:");
             for (Shapes shape : shapes) {
                 System.out.println(" - Flächeninhalt: " + shape.getArea());
             }
         }
     
       }
		
	}
	

