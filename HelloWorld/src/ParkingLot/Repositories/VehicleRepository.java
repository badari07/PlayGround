package ParkingLot.Repositories;

import ParkingLot.Models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Vehicle save(Vehicle vehicle) {
        // Save vehicle to database
        return null;
    }

    public void removeVehicle(Vehicle vehicle) {
        // Remove vehicle from database
    }

    public Optional<Vehicle> findVehicleById(Long id) {
        // Get vehicle from database
        return Optional.empty();
    }

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
        // Get vehicle from database
        return Optional.empty();
    }
}
