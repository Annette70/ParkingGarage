public class SpecialEvent {

    /**
     * Sets the value for the price of a Special Event
     * The only price value for a SpecialEvent is 20
     * Singleton Pattern
     */

private static SpecialEvent singleInstance = null;
private int Price;

    public int getPrice() {
        return Price;
    }

    private SpecialEvent(){
    Price = 20;
}
public static SpecialEvent getInstance(){
    if (singleInstance == null)
        singleInstance = new SpecialEvent();
    return singleInstance;
}

}
