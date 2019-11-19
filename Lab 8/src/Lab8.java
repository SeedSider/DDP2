import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) {
		String filename = "shakespeare.txt";
		/**
		 * Try the code if file is valid
		 * Add text line by line to ArrayList
		 */
		try {
			Scanner s = new Scanner(new File(filename));
			ArrayList<String> lines = new ArrayList<>();

			while(s.hasNextLine()) {
				lines.add(s.nextLine());
			}

			/**
			 * Loop for counting empty lines and lines that have thou word
			 */
			int nullCount = 0;
			int thouCount = 0;
			for(String line : lines) {
				if(line.equals("")) {
					nullCount++;
				}
				/**
				 * Split each line to array or words
				 * Check if there's word equals thou in that line
				 */
				String[] words = line.split(" ");
				boolean isThou = false;
				for(String word : words) {
					if(word.toLowerCase().equals("thou")) {
						isThou = true;
					}
				}

				/**
				 * Increment the thouCount if thou is found in the lines
				 */
				if(isThou) {
					thouCount++;
					isThou = false;
				}
			}

			System.out.println("Jumlah baris					: " + lines.size());
			System.out.println("Jumlah baris kosong				: " + nullCount);
			System.out.println("Jumlah baris mengandung thou	: " + thouCount);
		}

		catch(IOException e) {
			System.out.println("File not found!");
		}

	}
}
