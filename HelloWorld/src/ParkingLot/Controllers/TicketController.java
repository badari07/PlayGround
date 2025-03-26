package ParkingLot.Controllers;

import ParkingLot.DTO.IssueTicketRequestDTO;
import ParkingLot.DTO.IssueTicketResponsetDTO;
import ParkingLot.DTO.ResponseStatus;
import ParkingLot.Models.Ticket;
import ParkingLot.Services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponsetDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {
       IssueTicketResponsetDTO issueTicketResponsetDTO = new IssueTicketResponsetDTO();

        try {
            Ticket ticket = ticketService.issueTicket(issueTicketRequestDTO.getVehicleNumber(), issueTicketRequestDTO.getOwnerName(), issueTicketRequestDTO.getGateId(), issueTicketRequestDTO.getOparatorId());
            issueTicketResponsetDTO.setTicket(ticket);
            issueTicketResponsetDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
           issueTicketResponsetDTO.setResponseStatus(ResponseStatus.FAILURE);
        }

        return issueTicketResponsetDTO;

    }
}
