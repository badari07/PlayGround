package ParkingLot.Strtagies;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSpot;
import ParkingLot.Models.Vehicle;

public interface ParkingSpotAssignmentStratgy {
    ParkingSpot assignParkingSpot(Vehicle vehicle, ParkingLot parkingLot);
}
