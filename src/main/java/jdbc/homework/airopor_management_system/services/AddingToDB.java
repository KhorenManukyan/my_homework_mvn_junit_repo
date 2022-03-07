package jdbc.homework.airopor_management_system.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddingToDB {
    private static void addCompanies() {
        String sql = "insert into companies(name, found_date) values(?,?)";

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("")
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void addPassenger() {
        String sql = "insert into companies(name, found_date) values(?,?)";

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("")
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void addAddress() {
        String sql = "insert into companies(name, found_date) values(?,?)";

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("")
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //The trip hasn't have information
    //Tigran doesn't send the info about trip
    private static void addTrip() {

    }
}
