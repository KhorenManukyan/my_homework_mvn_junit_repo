package jdbc.homework.airopor_management_system.dao.impl;

import jdbc.homework.airopor_management_system.configuration.DbConnection;
import jdbc.homework.airopor_management_system.dao.CompanyDAO;
import jdbc.homework.airopor_management_system.dao.TripDAO;
import jdbc.homework.airopor_management_system.model.Trip;

import java.sql.*;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TripDAOImpl implements TripDAO {
    private final static String GET_TRIP_BY_ID = "select * from trip where trip_number = ?";
    private final static String GET_ALL_TRIPS = "select * from trip";
    private final static String SAVE_TRIP = "insert into trip(company_id, time_in, time_out, town_to, town_from) values(?,?,?,?,?)";
    private Connection connection = DbConnection.getInstance().getConnection();
    private CompanyDAO companyDAO = new CompanyDAOImpl();

    @Override
    public Trip getById(long id) {
        Trip trip = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_TRIP_BY_ID);
             ResultSet resultSet = preparedStatement.executeQuery();) {

            preparedStatement.setLong(1, id);
            if (resultSet.next()) {
                trip = new Trip();
                trip.setCompany(companyDAO.getById(resultSet.getInt(2)));
                trip.setTimeIn(resultSet.getTimestamp(3).toLocalDateTime());
                trip.setTimeOut(resultSet.getTimestamp(4).toLocalDateTime());
                trip.setTownTo(resultSet.getString(5));
                trip.setTownFrom(resultSet.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trip;
    }

    @Override
    public Set<Trip> getAll() {
        Trip trip = null;
        Set<Trip> trips = new TreeSet<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_TRIPS);
             ResultSet resultSet = preparedStatement.executeQuery();) {
            while (resultSet.next()) {
                trip = new Trip();
                trip.setCompany(companyDAO.getById(resultSet.getInt(2)));
                trip.setTimeIn(resultSet.getTimestamp(3).toLocalDateTime());
                trip.setTimeOut(resultSet.getTimestamp(4).toLocalDateTime());
                trip.setTownTo(resultSet.getString(5));
                trip.setTownFrom(resultSet.getString(6));
                trips.add(trip);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trips;
    }

    @Override
    public Set<Trip> get(int page, int perPage, String sort) {
        return null;
    }

    @Override
    public Trip save(Trip passenger) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SAVE_TRIP, Statement.RETURN_GENERATED_KEYS);
             ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
            preparedStatement.setInt(1, (int) passenger.getCompany().getId());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(passenger.getTimeIn()));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(passenger.getTimeOut()));
            preparedStatement.setString(4, passenger.getTownTo());
            preparedStatement.setString(5, passenger.getTownFrom());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passenger;
    }

    @Override
    public Trip update(Trip passenger) {
        return null;
    }

    @Override
    public void delete(long tripId) {

    }

    @Override
    public List<Trip> getTripsFrom(String city) {
        return null;
    }

    @Override
    public List<Trip> getTripsTo(String city) {
        return null;
    }
}
