package azhar_problem1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Application {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		DuplicateRemover dupRemover = new DuplicateRemover();
		dupRemover.remove("src/problem1.txt");
		
		DuplicateRemover uniqueWordsObject = new DuplicateRemover();
		ArrayList<String> uniqueWordsString = uniqueWordsObject.uniqueWords;
		
		DuplicateRemover writer = new DuplicateRemover();
		writer.write(uniqueWordsString);
		
	}

}
