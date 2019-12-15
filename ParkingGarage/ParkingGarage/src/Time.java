import java.util.Random;

public class Time {
    static final int EARLIEST_START_TIME = 7;
    static final int LATEST_START_TIME = 12;

    static final int EARLIEST_END_TIME = 13;
    static final int LATEST_END_TIME = 23;

    /**
     * Calculates random checkIn time
     */

    public static int startTime() {
        Random checkIn = new Random();
        int result = checkIn.nextInt(LATEST_START_TIME - EARLIEST_START_TIME) + EARLIEST_START_TIME;
        return result;
    }
    /**
     * Calculates random checkOut time
     */
    public static int endTime(){
        Random checkOut = new Random();
        int result = checkOut.nextInt(LATEST_END_TIME - EARLIEST_END_TIME) + EARLIEST_END_TIME;
        return result;
    }
}