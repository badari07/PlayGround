package ParkingLot;

import ParkingLot.Controllers.TicketController;
import ParkingLot.DTO.IssueTicketRequestDTO;
import ParkingLot.DTO.IssueTicketResponsetDTO;
import ParkingLot.Factory.ParkingSpotAssignStratgyFactory;
import ParkingLot.Models.*;
import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.VehicleRepository;
import ParkingLot.Services.TicketService;
import ParkingLot.Strtagies.ParkingSpotAssignmentStratgy;

public class ParkingLotAppliction {
    public static void main(String[] args) {

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingSpotAssignmentStratgy parkingSpotAssignmentStratgy = ParkingSpotAssignStratgyFactory.getParkingSpotAssignStratgy(ParkingSpotStrtagy.NEAREST);
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingSpotAssignmentStratgy);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setVehicleNumber("MH-12-1234");
        issueTicketRequestDTO.setOwnerName("Rahul");
        issueTicketRequestDTO.setGateId(1L);
        issueTicketRequestDTO.setOparatorId(1L);

        IssueTicketResponsetDTO issueTicketResponsetDTO = ticketController.issueTicket(issueTicketRequestDTO);
        Ticket ticket = issueTicketResponsetDTO.getTicket();
        System.out.println(issueTicketResponsetDTO.getResponseStatus());
        System.out.println(ticket);

    }
}
