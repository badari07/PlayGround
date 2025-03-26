package ParkingLot.Repositories;

import ParkingLot.Models.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {

    //gate table
    private HashMap<Long, Gate>  gates = new HashMap<>();


    //CRUD operations
    public void addGate(Gate gate){
        gates.put(gate.getId(), gate);
    }

    public Optional<Gate> findGateById(Long id){
        return Optional.ofNullable(gates.get(id));
    }
}
