import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Takes ticket information from a file and stores it in an ArrayList
 */

public class FileOutput {
    Reader out = null;
    private String fileName;

    public ArrayList<Ticket> FileOutput(String fileName) {
        this.fileName = fileName;
        ArrayList<Ticket> tickets = new ArrayList<>();
        try
        {
            Scanner inFile = new Scanner(new File(fileName));
            while (inFile.hasNext()){
                int checkIn = inFile.nextInt();
                int checkOut = inFile.nextInt();
                boolean lost = inFile.nextBoolean();
                boolean specialEvent = inFile.nextBoolean();
                int vehicleID = inFile.nextInt();
                Ticket ticket = new Ticket(checkIn, checkOut, lost, specialEvent, vehicleID);
                tickets.add(ticket);
            }
        }
        catch (FileNotFoundException e)
        {

        }
        return tickets;
    }
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
