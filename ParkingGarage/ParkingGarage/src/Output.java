import java.util.ArrayList;

public class Output {
    /**
     * Calls the Factory to get a receipt for the ticket
     */
public static void printTicket(Ticket ticket){
    TicketTextFactory factory = new TicketTextFactory();
    factory.getPrinter(ticket).printTicketText(ticket);
}
    /**
     * Closes the parking garage
     * Prints the total revenue for each ticket type and the total ticket amount
     */

    public static void CloseGarage(ArrayList<Ticket> tickets){
        int totalLostTicketPrice = 0;
        int totalCheckedOutTicketPrice = 0;
        int totalSpecialEventTicketPrice = 0;
        int lostCount = 0;
        int specialEventCount = 0;
        int checkedOutCount = 0;
        for(Ticket ticket : tickets){
            if (ticket.isLost()){
                lostCount++;
                totalLostTicketPrice += ticket.getPrice();
            } else if (ticket.isSpecialEvent()){
                specialEventCount++;
                totalSpecialEventTicketPrice += ticket.getPrice();
            } else {
                checkedOutCount++;
                totalCheckedOutTicketPrice += ticket.getPrice();
            }
        }
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Activity to Date");
        System.out.println("$" + totalCheckedOutTicketPrice + " Was collected from " + checkedOutCount + " Check Ins");
        System.out.println("$" + totalLostTicketPrice + " Was collected from " + lostCount + " Lost Tickets.");
        System.out.println("$" + totalSpecialEventTicketPrice + " Was collected from " + specialEventCount + " Special Events");
        System.out.println("$" + ( totalCheckedOutTicketPrice + totalLostTicketPrice + totalSpecialEventTicketPrice) + " Was collected overall");
    }
}

