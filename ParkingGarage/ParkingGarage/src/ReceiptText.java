public class ReceiptText implements TicketText {
    /**
     * Prints a regular ticket receipt
     */
    @Override
    public void printTicketText(Ticket ticket){
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle ID: " + ticket.getVehicleID());
        System.out.println(ticket.getHours() + " hours parked.");
        System.out.println("$" + ticket.getPrice());
    }
}
