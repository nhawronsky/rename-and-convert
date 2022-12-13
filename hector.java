import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import bin.Converter;
import bin.Renamer;

public class hector {
	public static void main(String[] args) throws IOException, InterruptedException {

		// declared a date of invoice
		String month = Files
				.readAllLines(Paths.get("/Users/nhawronsky/Documents/Work/hector/data.txt"))
				.get(1);
		String year = Files
				.readAllLines(Paths.get("/Users/nhawronsky/Documents/Work/hector/data.txt"))
				.get(4);

		// choosing way doing of program
		System.out.println("1 -> start renamer\n" + "2 -> start converter");
		System.out.print("your choose: ");
		
		// input from keyboard
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		// switcher
		switch (x) {
			case 1 -> renamer(month, year);
			case 2 -> converter();
		}
	}

	// renaming numbered folders to the correct form
	static void renamer(String month, String year) {
		Renamer ren = new Renamer(month, year);
		ren.start();
	}

	// converter of photos
	static void converter() throws IOException {
		Converter con = new Converter();
		con.start();
	}
}