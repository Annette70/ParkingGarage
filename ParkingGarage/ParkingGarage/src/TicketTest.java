import org.junit.jupiter.api.Test;
/**
 * JUnit test
 */
public class TicketTest {

    @Test
    public void testGetPrice(){
        Ticket ticket = new Ticket(7, 20, false, false, 1);
        assert(ticket.getPrice() == 15);
    }
    @Test
    public void testGetSpecialEventPrice(){
        Ticket ticket2 = new Ticket(7, 20, false, true, 2);
        assert(ticket2.getPrice() == 20);
    }
    @Test
    public void testGetLostTicketPrice(){
        Ticket ticket3 = new Ticket(7, 0, true, false, 3);
        assert(ticket3.getPrice() == 25);
    }
}
