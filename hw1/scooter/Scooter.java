package homeworks.hw1.scooter;

public class Scooter {

    // Unique identifier for the scooter.
    int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location;
    double x, y;

    // Indicates if the scooter is available
    boolean available;

    //returns the id of a scooter
    public int getId() {
        return id;
    }
    
    //sets the id of a scooter
    public void setId(int id) {
        this.id = id;
    }
    
    //returns the model of the scooter
    public String getModel() {
        return model;
    }

    //sets the model of a scooter
    public void setModel(String model) {
        this.model = model;
    }
    
    //returns the battery level of a scooter
    public int getBatteryLevel() {
        return batteryLevel;
    }
    
    //sets the battery level of a scooter
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    //returns the x coordinate of a scooter
    public double getX() {
        return x;
    }

    //sets the x coordinate of a scooter
    public void setX(double x) {
        this.x = x;
    }

    //returns the y coordinater of a scooter
    public double getY() {
        return y;
    }

    //sets the y coordinate of a scooter
    public void setY(double y) {
        this.y = y;
    }

    // returns true or false if about if scooter is available or not
    public boolean isAvailable() {
        return available;
    }

    // sets if scooter is available or not
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
