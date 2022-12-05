import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Show {
    
    // MEMBERS
    public int show_id;
    public String show_name;
    public String show_status;
    public int show_date;
    public String show_synopsis;
    public String show_cast;
    // END MEMBERS


    // METHODS
    public void addshows(){

        BufferedReader reader;
        try {
			reader = new BufferedReader(new FileReader(
					"movies.txt"));
			String line = reader.readLine();
            line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }


    public void printshows(int id){

        BufferedReader reader;
        try {
			reader = new BufferedReader(new FileReader(
					"shows.txt"));
			String line = reader.readLine();
            //line = reader.readLine();
            int index = 0;
			while (index != id) {
				// read next line
				line = reader.readLine();
                index++;
			}
            if (index < 10) line = line.substring(3);
            else line = line.substring(4);
            String[] times = line.split("\\, ");
            for (int i = 0; i < times.length; i++)
                System.out.println(times[i]);
            System.out.println();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    public String findTime(int id, int time) {
        BufferedReader reader;
        try {
			reader = new BufferedReader(new FileReader(
					"shows.txt"));
			String line = reader.readLine();
            int index = 0;
			while (index != id) {
				// read next line
				line = reader.readLine();
                index++;
			}
            if (index < 10) line = line.substring(3);
            else line = line.substring(4);
            String[] times = line.split("\\, ");
			reader.close();
            return times[time-1].substring(3);
		} catch (IOException e) {
			e.printStackTrace();
		}


        return "";

    }


    public void show_details(int show_id, String show_name, String show_status, 
        int show_date, String show_synopsis, String show_cast) {
            this.show_id = show_id;
            this.show_name = show_name;
            this.show_status = show_status;
            this.show_date = show_date;
            this.show_synopsis = show_synopsis;
            this.show_cast = show_cast;
        }
    // END METHODS

}
