package ParkingLot.Services;

import ParkingLot.Models.Gate;
import ParkingLot.Models.Ticket;
import ParkingLot.Models.Vehicle;
import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.VehicleRepository;
import ParkingLot.Strtagies.ParkingSpotAssignmentStratgy;
import ParkingLot.exceptions.GateNotFoundException;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingSpotAssignmentStratgy parkingSpotAssignmentStratgy;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingSpotAssignmentStratgy parkingSpotAssignmentStratgy) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingSpotAssignmentStratgy = parkingSpotAssignmentStratgy;

    }
    public Ticket issueTicket( String vehicleNumber,String ownerName,Long gateId,Long oparatorId ) throws GateNotFoundException {
            Ticket ticket = new Ticket();
            ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Gate not found");
        }

        Gate gate= optionalGate.get();
        ticket.setGate(gate);
        ticket.setOparator(gate.getOparator());
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle = null;
        if (optionalVehicle.isEmpty()) {
            Vehicle v = new Vehicle();
            v.setOwnerName(ownerName);
            v.setNumber(vehicleNumber);
            vehicle= vehicleRepository.save(vehicle);
        } else {
          vehicle =optionalVehicle.get();
        }

        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpotAssignmentStratgy.assignParkingSpot(vehicle, gate.getParkingLot()));



        return ticket;

    }
}
