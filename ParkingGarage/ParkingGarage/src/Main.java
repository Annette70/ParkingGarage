import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int choice = 0;
        Ticket ticket = null;
        FileInput fileInput = new FileInput();
        FileOutput fileOutput = new FileOutput();
        ArrayList<Ticket> tickets = fileOutput.FileOutput("ParkingTickets");
        fileOutput.fileClose();

        while (choice != 3) {
            choice = Input.CheckInMenu();
            switch (choice) {
                case 1:
                    ticket = new Ticket(tickets.size(), false);
                    choice = Input.CheckOutMenu();
                    switch (choice) {
                        case 1:
                            ticket.CheckOut();
                            //check out to the garage
                            //calculates random check-out time
                            break;
                        case 2:
                            ticket.lostTicket();
                            //set boolean lost to true
                            //print out lost ticket price
                            break;
                    }
                    //check in to the garage
                    //calculates random check-in time
                    break;
                case 4:
                    ticket = new Ticket(tickets.size(), true);
                    break;
                    //Special event
                case 3:
                    String parkingTickets = "ParkingTickets";
                    fileInput.write(parkingTickets, tickets);
                    //close the garage
                    //write to a file
                    continue;
            }
            Output.printTicket(ticket);
            tickets.add(ticket);
        }
        Output.CloseGarage(tickets);
    }
}
