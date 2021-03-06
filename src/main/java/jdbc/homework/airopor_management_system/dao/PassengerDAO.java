package jdbc.homework.airopor_management_system.dao;

import jdbc.homework.airopor_management_system.model.Passenger;

import java.util.List;
import java.util.Set;

public interface PassengerDAO {
    Passenger getById(long id);

    Set<Passenger> getAll();

    Set<Passenger> get(int page, int perPage, String sort);

    Passenger save(Passenger passenger);

    Passenger update(Passenger passenger);

    void delete(long passengerId);

    List<Passenger> getPassengerOfTrip(long tripNumber);
}
