package homeworks.hw1.scooter;

import java.util.ArrayList;

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
        scooter.setId(uid++);
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
    public void rentScooter(int id) {
    	boolean rented = false;
    	for (Scooter scooter: scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                rented = true;
                scooter.setAvailable = false;
                break;
            }
        }
    	return rented;
    }

    // function to call when user returns a rented scooter
    public void returnScooter(int id, double x, double y) {
    	for (Scooter scooter: scooters) {
            if (scooter.getId() == id && scooter.isAvailable() == false) {
                scooter.setAvailable = true;
                scooter.setY(y);
                scooter.setX(x);
                break;
            }
        }
    	return scooter.isAvailable();
    }	
    
    // function to print out all of the scooters information
    public void displayAllScooters() {
    	for (Scooter scooter: scooters) {
    		System.out.println("id: " + scooter.getId());
    		System.out.print(" model" + scooter.getModel());
    		System.out.print(" battery level:" + scooter.getBatteryLevel());
    		System.out.print(" X coordinate:" + scooter.getX());
    		System.out.print(" Y coordinate:" + scooter.getY());
    		System.out.print(" is available:" + scooter.isAvailable());
    		System.out.println("");
        }
    }
}

class ScooterRentalTester {
	public static void main(String[] args) {
        // Create an instance of RentalCompany
        RentalCompany rentalCompany = new RentalCompany();

        // create two new scooters because we dont have any for now
        rentalCompany.addScooter(new Scooter("lvl10GYAT", 24, 20, 21)); // initialising with model, battery, x, y,(coordinates)
        rentalCompany.addScooter(new Scooter("rizz", 100, 41.706842030585925, 44.738849390210085)); // initialising this scooter in my "home" location
        

        rentalCompany.rentScooter(1); // Rent a scooter with ID 1 
        
        rentalCompany.returnScooter(1, 41.7121106, 44.7489232); //Return the rented scooter to uni for parking
        
        Thread.sleep(3600 * 1000);// sleep the program for 1 hour
        
        rentalCompany.rentScooter(1); // Rent a scooter with ID 1 again

        rentalCompany.returnScooter(1, 41.706842030585925, 44.738849390210085); // Return a rented scooter with ID 1 in BTU (because i dont want to share my home address) 

        
        
    }
	
}