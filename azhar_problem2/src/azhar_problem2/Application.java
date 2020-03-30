package azhar_problem2;

import java.io.FileNotFoundException;

public class Application {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		DuplicateCounter dupCounter = new DuplicateCounter();
		dupCounter.count("src/problem2.txt");
		
		DuplicateCounter writer = new DuplicateCounter();
		writer.write("src/problem2.txt");
		
	}

}