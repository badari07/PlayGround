package ParkingLot.Models;

public class Gate extends BaseModel{
    private int gateNumber;
    private Oparator oparator;
    private GateType gateType;
    private GateStatus gateStatus;
    private ParkingLot parkingLot;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Oparator getOparator() {
        return oparator;
    }

    public void setOparator(Oparator oparator) {
        this.oparator = oparator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
