package bin;
import java.io.File;

public class Renamer {
	// variables declared a date of invoice
    private String month;
    private String year;

	// constructor of renamer
	public Renamer(String month, String year) {
		this.month = month;
		this.year = year;
	}
	// starter for renamer
    public void start() {
        // declared a variable to count how many folders are converted
		int j = 0;
		// loop to rename all folders 
		for (int i = 1; i <= 200; i++) {
			// variable of an unnamed folder
			String pathname = "/Users/nhawronsky/Documents/Work/hector/renamer/" + i;
			// variable how the folder should looks like
			String renamed_directory = "/Users/nhawronsky/Documents/Work/hector/renamer/" + "FV:" + i + ":"
					+ month + ":" + year;
			// class who works with folders
			File source = new File(pathname);
			File destFile = new File(renamed_directory);
			// renamer
			if (source.renameTo(destFile)) {
				// show changed folder
				System.out.printf("%10s", "--> " + i + " renamed to" + " FV:" + i + ":" + month + ":" + year + "\n");
				// counter
				j++;
			}
		}
		// demonstration of renamer
		if (j == 0)
			System.out.printf("%10s", "--> There are no folders to change" + "\n");
		else 
			System.out.printf("%10s", "--> Folders renamered: " + j + "\n");
    }
}