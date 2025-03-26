package ParkingLot.Factory;

import ParkingLot.Models.ParkingSpotStrtagy;
import ParkingLot.Strtagies.NearestSpotAssignmentStratgy;
import ParkingLot.Strtagies.ParkingSpotAssignmentStratgy;

public class ParkingSpotAssignStratgyFactory {
    public static ParkingSpotAssignmentStratgy getParkingSpotAssignStratgy(ParkingSpotStrtagy parkingSpotStrtagy) {
        switch (parkingSpotStrtagy) {
            case NEAREST:
                return new NearestSpotAssignmentStratgy();
            case CHEAPEST:
                return null;
            default:
                return null;
        }
    }
}
