package ParkingLot.DTO;

import ParkingLot.Models.Ticket;
import ParkingLot.Models.VehicleType;

public class IssueTicketResponsetDTO {
   private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    private ResponseStatus responseStatus;
}
