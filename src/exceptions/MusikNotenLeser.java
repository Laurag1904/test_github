package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        	File output = new File("output.txt");
        	FileWriter fw = new FileWriter (output);
        	BufferedWriter bw = new BufferedWriter(fw);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(noten.contains(line)) {
                	bw.write("M:C");
                	bw.newLine();
                	bw.write("L:1/4");
                	bw.newLine();
                	bw.write("K:C");
                	bw.newLine();
                	bw.write(line + " ");
                }  
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}
