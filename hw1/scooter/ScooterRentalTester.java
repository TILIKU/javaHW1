package homeworks.hw1.scooter;

public class ScooterRentalTester {

    public static void main(String[] args) {

        // Create an instance of RentalCompany
        RentalCompany rentalCompany = new RentalCompany();

        // create two new scooters because we dont have any for now
        Scooter scooter1 = new Scooter();
        Scooter scooter2 = new Scooter();

        // Set IDs for the scooters
        scooter1.setId(1);
        scooter2.setId(2);

        // Set battery levels for the scooters
        scooter1.setBatteryLevel(100);
        scooter2.setBatteryLevel(87);

        // Set models for the scooters
        scooter1.setModel("rizz"); // random scooter
        scooter2.setModel("king stuff"); // scooter were gonna use

        // Set x & y coordinates for the scooters
        scooter1.setX(41.7121106); //initialize one scooter at university
        scooter2.setX(41.706842030585925);// initialize the second one at "home" (its coordinates of btu)
        scooter1.setY(44.7489232);
        scooter2.setY(44.738849390210085);

        // add scooters to rentalCompany class so we can use methods of that class
        rentalCompany.addScooter(scooter1);
        rentalCompany.addScooter(scooter2);


        rentalCompany.rentScooter(2); // Rent a scooter with ID 2

        rentalCompany.returnScooter(2, 41.7121106, 44.7489232); //Return the rented scooter to uni for parking


        try {
            Thread.sleep(3600 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }// sleep the program for 1 hour
        // try catch just in case it throws an exception

        rentalCompany.rentScooter(2); // Rent a scooter with ID 2 again from uni now

        rentalCompany.returnScooter(2, 41.706842030585925, 44.738849390210085); // Return a rented scooter with ID 2 in BTU (because i dont want to share my home address)

        rentalCompany.displayAllScooters();

    }

}
