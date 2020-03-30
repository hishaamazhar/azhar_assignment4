package azhar_problem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateCounter{
	
	public ArrayList<String> wordCounter;
	public int count = 0;
	
	public void count(String dataFile) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream(dataFile);
		Scanner fileInput = new Scanner(file);
		
		ArrayList<String> wordsArray = new ArrayList<String>();
		ArrayList<Integer> wordCountArray = new ArrayList<Integer>();
		
		while(fileInput.hasNext()) {
			
			String word = fileInput.next();
			
			if(wordsArray.contains(word)) {
				int wordList = wordsArray.indexOf(word);
			}
			else {
				wordsArray.add(word);
			}
			
		}

		/*Scanner fileScanner = new Scanner(new File(dataFile));
		
		HashMap<String,Integer> hashCounter = new HashMap<>();

			if(hashCounter.get(fileScanner.hasNext()) == null) {
				hashCounter.put(fileScanner.hasNext(), 1);
				count = 1;
			}
			else {
				count += 1;
				hashCounter.put(fileScanner.hasNext(), count);
			}*/
		
	}
	
	public void write(String outputFile) throws FileNotFoundException {
		
		Formatter inputInFile = new Formatter("src/unique_words_counts.txt");
		inputInFile.format("%s", wordCounter);
		
		inputInFile.close();
		
	}
	
}
