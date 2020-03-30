package azhar_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Formatter;
import java.util.ArrayList;

public class DuplicateRemover{
	
	public ArrayList<String> uniqueWords;
	
	public void remove(String dataFile) throws FileNotFoundException {

		HashSet<String> hashObject = new HashSet<>();
		
		Scanner fileReader = new Scanner(new File(dataFile));
		
		ArrayList<String> arrayObject = new ArrayList<String>();
		
		while(fileReader.hasNext()) {
			
			arrayObject.add(fileReader.next());
			hashObject.addAll(arrayObject);
			
			arrayObject.clear();
			arrayObject.addAll(hashObject);
			
			uniqueWords = arrayObject;
			
		}
		
	}
	
	public void write(ArrayList<String> outputFile) throws FileNotFoundException {
		
		Formatter inputInFile = new Formatter("src/unique_words.txt");
		inputInFile.format("%s", outputFile);
		
		inputInFile.close();
		
	}
	
}
