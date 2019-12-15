import java.util.ArrayList;

/**
 * Represents a ticket obtained in a parking garage
 * A ticket has one checkIn and checkOut time
 * A ticket can be lost or obtained for a special event
 * Every ticket has a vehicleID associated with it
 */

public class Ticket {
    private int checkIn;
    private int checkOut;
    private boolean lost = false;
    private boolean specialEvent = false;
    private int vehicleID;

    public Ticket(int vehicleID, boolean specialEvent) {
       checkIn = Time.startTime();
       this.vehicleID = vehicleID;
       this.specialEvent = specialEvent;
    }

    public Ticket(int checkIn, int checkOut, boolean lost, boolean specialEvent, int vehicleID) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.lost = lost;
        this.specialEvent = specialEvent;
        this.vehicleID = vehicleID;
    }

    public void CheckOut(){
        checkOut = Time.endTime();
    }
    public int getCheckIn() {
        return checkIn;
    }
    public int getCheckOut() {
        return checkOut;
    }

    public void lostTicket(){ lost = true; }

    public boolean isLost() {
        checkOut = 0;
        return lost;
    }
    public boolean isSpecialEvent(){
        return specialEvent;
    }

    public int getVehicleID() {
        return vehicleID;
    }
    public int getHours(){
        return checkOut - checkIn;
    }

    /**
     * calculates the price of the ticket
     */

    public int getPrice(){
        int price = 0;
        if (lost){
            price = 25;
            return price;
        }
        if (specialEvent){
            price = SpecialEvent.getInstance().getPrice();
            return price;
        }
        price = getHours() + 2;
        if (getHours() < 5){
            price = 5;
        }
        if (price > 15){
            price = 15;
        }
        return price;
    }
    public String ToString(){
         return checkIn + "\n" + checkOut + "\n" + lost + "\n" + specialEvent + "\n" + vehicleID + "\n";
    }
}
