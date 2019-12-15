public class LostText implements TicketText {
    /**
     * Prints the receipt for a lost ticket
     */
    @Override
    public void printTicketText(Ticket ticket){
        ticket.lostTicket();
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle ID: " + ticket.getVehicleID());
        System.out.println("Lost Ticket");
        System.out.println("$" + ticket.getPrice());
    }
}
