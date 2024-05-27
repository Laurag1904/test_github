package exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class WriteCurrentTimeToFile {
	
	static String fileName = "Laura.txt";
	
	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(LocalDateTime.now().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
