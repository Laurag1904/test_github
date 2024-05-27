package exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusikNotenLeser {

	public static void main(String[] args) {
		List<String> noten = Arrays.asList("C", "D", "E", "F", "G", "A", "B","C,", "D,", "E,", "F,", "G,", "A,", "B,", "c", "d", "e", "f", "g", "a","b", "c'", "d'", "e'", "f'", "g'", "a'","b'");
		Path filePath = Paths.get("file.txt");
		Path outputFilePath = Paths.get("output.txt");

        try (Scanner scanner = new Scanner(filePath);
        	PrintWriter writer = new PrintWriter(Files.newBufferedWriter(outputFilePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(noten.contains(line)) {
                	System.out.println(line);
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	
	 private static boolean isValidLine(String line) {
	        return line.matches("[CDEFGABcdefgab', ]+");
	 }
	 
	 

}
