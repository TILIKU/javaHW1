package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

    private int uid = 0; // we will use this to id scooters

    List<Scooter> scooters = new ArrayList<>(); // creates new arraylist scooters of type Scooter

    // displays the list of all avalible scooters
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter: scooters) { //simple for loop to operate over each scooter instance in scooters list, we use this a lot
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    //adds scooter to the scooters list
    public void addScooter(Scooter scooter) {
        scooters.add(scooter);
    }

    //removes a scooter by id
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    // function to rent a scooter
    public boolean rentScooter(int id) {
        boolean rented = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                rented = true;
                scooter.setAvailable(false);
                break;
            }
        }
        return rented;
    }

    // function to call when user returns a rented scooter
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true);
                scooter.setY(y);
                scooter.setX(x);
                break;
            }
        }
    }

    // function to print out all of the scooters information
    public void displayAllScooters() {
        for (Scooter scooter: scooters) {
            System.out.println("id: " + scooter.getId());
            System.out.print(" model: " + scooter.getModel());
            System.out.print(" battery level:" + scooter.getBatteryLevel());
            System.out.print(" X coordinate:" + scooter.getX());
            System.out.print(" Y coordinate:" + scooter.getY());
            System.out.print(" is available:" + scooter.isAvailable());
            System.out.println("");
        }
    }
}