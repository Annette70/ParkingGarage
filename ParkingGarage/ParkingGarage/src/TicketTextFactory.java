public class TicketTextFactory {

    /**
     * TicketTextFactory gets receipt text based on the type of ticket
     * If a ticket is lost the factory will print a lost ticket receipt
     * If a ticket is for an event the factory will print an event ticket receipt
     * Otherwise, the factory will print a regular ticket receipt
     * Factory Pattern
     */

    public TicketText getPrinter(Ticket ticket){
        if (ticket.isLost()){
            return new LostText();
        }
        if (ticket.isSpecialEvent()){
            return new EventText();
        }
        return new ReceiptText();
    }
}
