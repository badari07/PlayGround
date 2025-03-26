package ParkingLot.Models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private List<ParkingSpot> parkingSpots;
    private List<ParkingFloor> parkingFloors;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return SupportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        SupportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    private List<Gate> gates;
    private List<VehicleType>  SupportedVehicleTypes;
    private ParkingLotStatus parkingLotStatus;

}
