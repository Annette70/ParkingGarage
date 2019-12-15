public class EventText implements TicketText {
    /**
     * Prints a receipt for an event ticket
     */
    @Override
    public void printTicketText(Ticket ticket){
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle ID: " + ticket.getVehicleID());
        System.out.println("Special Event");
        System.out.println("$" + SpecialEvent.getInstance().getPrice());
    }
}
