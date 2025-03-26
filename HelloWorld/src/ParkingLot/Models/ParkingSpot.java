package ParkingLot.Models;

import java.util.List;

public class ParkingSpot extends BaseModel{

    private List<VehicleType> SupportedVehicleTypes;
    private int spotNumber;

    public List<VehicleType> getSupportedVehicleTypes() {
        return SupportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        SupportedVehicleTypes = supportedVehicleTypes;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    private ParkingFloor parkingFloor;
    private ParkingFloorStatus parkingFloorStatus;
}
