import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Admin {
    
    // MEMBERS
    //private int admin_id;
    //private String admin_name;
    //private String admin_password;
    // END MEMBERS

    // METHODS
    public void StatusReport() throws IOException {
        System.out.println("Movies Showing:");
        BufferedReader reader;
        try {
			reader = new BufferedReader(new FileReader(
					"movies.txt"));
			String line = reader.readLine();
            line = reader.readLine();
			while (line != null) {
				String[] str = line.split("\\. "); 
                String[] str1 = str[0].split("\\, ");
                System.out.println(str[0] + ". " + str1[0] + "");
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println();
        try {
			reader = new BufferedReader(new FileReader("Sales.txt"));
			System.out.println("Ticket Sales per movie: ");
			String line="";
			int x=0;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(line!= null) {
				System.out.println("Movie"+x+" Sold: "+line);
				 line = reader.readLine();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void AddMovie(String count, String movieName, String runtime, String genre) {
        String newline = count + ". " + "\"" + movieName + "\", " + runtime + ", " + genre;
        Writer writer;
        try {
            writer = new BufferedWriter(new FileWriter("movies.txt", true));
			writer.append("\n" + newline);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println();
    }

    public void AddShowtime(int id, Scanner scanner) {
        //String newline = String.valueOf(id) + ". " + "\"" + movieName + "\", " + runtime + ", " + genre;
        //try (Scanner scanner = new Scanner(System.in);) {
        Writer writer;
        try {
            System.out.print("How many shows would you like to add? (1-9) ");
            int count = scanner.nextInt();
            scanner.nextLine();
            while (count > 9 || count < 1) {
                System.out.print("Enter a number greater than 0 and less than 10: ");
                count = scanner.nextInt();
            }
            String showtimes = String.valueOf(id) + ". ";
            for (int i = 1; i < count; i++) {
                System.out.print("Showtime #" + String.valueOf(i) + ": ");
                String st = scanner.nextLine();
                showtimes += String.valueOf(i) + ". " + st + ", ";
            }
            System.out.print("Showtime #" + String.valueOf(count) + ": ");
            String st = scanner.nextLine();
            showtimes += String.valueOf(count) + ". " + st;
            writer = new BufferedWriter(new FileWriter("shows.txt", true));
			writer.append("\n" + showtimes);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println();
    }
    //}

    public void RemoveMovie(int id) {
        StringBuffer inputBuffm = new StringBuffer();
        StringBuffer inputBuffs = new StringBuffer();
        BufferedReader reader;
        Writer writer;
        // delete movie from movies.txt
        try {
            reader = new BufferedReader(new FileReader(
					"movies.txt"));
			String line = reader.readLine();
            int lineIndex = -1000;
            int totalLines = -1;
			while (line != null) {
                totalLines++;
				// read next line
                String[] str = line.split("\\. ");
                if (str[0].equals(String.valueOf(id))) {
                    line = reader.readLine();
                    lineIndex = totalLines;
                    continue;
                }    
                inputBuffm.append(line);
				line = reader.readLine();
                if (line != null) inputBuffm.append("\n");
			}
            reader.close();
            String inputm = inputBuffm.toString();
            if (lineIndex == totalLines) inputm = inputm.substring(0, inputm.length()-1);
            writer = new BufferedWriter(new FileWriter("movies.txt"));
			writer.append(inputm);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

        // delete showtimes from shows.txt
        try {
            reader = new BufferedReader(new FileReader(
					"shows.txt"));
			String line = reader.readLine();
            int lineIndex = -1000;
            int totalLines = -1;
			while (line != null) {
                totalLines++;
				// read next line
                String[] str = line.split("\\. ");
                if (str[0].equals(String.valueOf(id))) {
                    lineIndex = totalLines;
                    line = reader.readLine();
                    continue;
                }    
                inputBuffs.append(line);
				line = reader.readLine();
                if (line != null) inputBuffs.append("\n");
			}
            reader.close();
            String inputs = inputBuffs.toString();
            if (lineIndex == totalLines) inputs = inputs.substring(0, inputs.length()-1);
            writer = new BufferedWriter(new FileWriter("shows.txt"));
			writer.append(inputs);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println();
    }
    



    public void UpdateMovie() {}
    



}