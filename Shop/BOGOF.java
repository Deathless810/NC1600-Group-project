

import java.time.Duration;
import java.time.LocalTime;

public class BOGOF {
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final Duration bogofDuration;
    
 // Constructor for BOGOF special with start time, end time, and duration
    public BOGOF(LocalTime startTime, LocalTime endTime, Duration bogofDuration) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.bogofDuration = bogofDuration;
    }

    // Constructor for BOGOF special with only start time and end time
    public BOGOF(LocalTime startTime, LocalTime endTime) {
    	this.startTime = startTime;
    	this.endTime = endTime;
    	this.bogofDuration = Duration.between(startTime, endTime);
    }

    // Method to check if a purchase time is during a BOGOF special
    public boolean isBOGOFspecial(LocalTime purchaseTime) {
        if (purchaseTime.isBefore(startTime) || purchaseTime.isAfter(endTime)) {
            return false;
        }

        LocalTime bogofEndTime = purchaseTime.plus(bogofDuration);
        if (bogofEndTime.isAfter(endTime)) {
            bogofEndTime = endTime;
        }

        return !purchaseTime.isAfter(bogofEndTime);
    }
}
    

