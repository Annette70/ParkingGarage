import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Writes ticket information to a file
 */

public class FileInput {
    public static void write (String filename, ArrayList<Ticket> tickets) throws IOException {
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for(Ticket ticket : tickets){
            outputWriter.write(ticket.ToString());
        }
        outputWriter.flush();
        outputWriter.close();
    }
}
