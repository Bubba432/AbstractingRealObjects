/**
 * Represents a playground swing with various properties and behaviors.
 * This class models a real-world swing that you might find at a playground.
 * 
 * @author David H.
 * @collaborator ChatGPT
 * @version 1.0
 */
public class Swing {
    // Instance variables (at least 6 required)
    private Seat seat;              // Object from secondary class
    private double chainLength;     // Length of chains in feet
    private String color;           // Color of the swing
    private int maxWeight;          // Maximum weight capacity in pounds
    private boolean isOccupied;     // Whether someone is currently on the swing
    private int swingCount;         // Number of times the swing has been used today
    
    /**
     * Default constructor - creates a standard swing
     */
    public Swing() {
        this.seat = new Seat("rubber");
        this.chainLength = 6.0;
        this.color = "blue";
        this.maxWeight = 150;
        this.isOccupied = false;
        this.swingCount = 0;
    }
    
    /**
     * Overloaded constructor - creates a custom swing with specified properties
     * @param seatMaterial Material for the seat
     * @param chainLength Length of the chains in feet
     * @param color Color of the swing
     * @param maxWeight Maximum weight capacity in pounds
     */
    public Swing(String seatMaterial, double chainLength, String color, int maxWeight) {
        this.seat = new Seat(seatMaterial);
        this.chainLength = chainLength;
        this.color = color;
        this.maxWeight = maxWeight;
        this.isOccupied = false;
        this.swingCount = 0;
    }
    
    // Accessor (getter) methods
    /**
     * Gets the seat object
     * @return The Seat object
     */
    public Seat getSeat() {
        return seat;
    }
    
    /**
     * Gets the chain length
     * @return The chain length in feet
     */
    public double getChainLength() {
        return chainLength;
    }
    
    /**
     * Gets the color of the swing
     * @return The swing color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Gets the maximum weight capacity
     * @return The maximum weight in pounds
     */
    public int getMaxWeight() {
        return maxWeight;
    }
    
    /**
     * Checks if the swing is occupied
     * @return true if occupied, false otherwise
     */
    public boolean isOccupied() {
        return isOccupied;
    }
    
    /**
     * Gets the swing count
     * @return The number of times the swing has been used today
     */
    public int getSwingCount() {
        return swingCount;
    }
    
    // Mutator (setter) methods
    /**
     * Sets the seat object
     * @param seat The new Seat object
     */
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    
    /**
     * Sets the chain length
     * @param chainLength The new chain length in feet
     */
    public void setChainLength(double chainLength) {
        this.chainLength = chainLength;
    }
    
    /**
     * Sets the color of the swing
     * @param color The new color
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Sets the maximum weight capacity
     * @param maxWeight The new maximum weight in pounds
     */
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    /**
     * Sets whether the swing is occupied
     * @param occupied true if occupied, false otherwise
     */
    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }
    
    /**
     * Sets the swing count
     * @param swingCount The new swing count
     */
    public void setSwingCount(int swingCount) {
        this.swingCount = swingCount;
    }
    
    // Behavior methods (at least 4 required: 2 with parameters, 2 without)
    
    /**
     * Behavior method WITH parameters
     * Simulates a person getting on the swing
     * @param personWeight The weight of the person in pounds
     * @return true if the person can safely use the swing, false otherwise
     */
    public boolean getOn(int personWeight) {
        if (isOccupied) {
            System.out.println("Sorry, the swing is already occupied!");
            return false;
        }
        
        if (personWeight > maxWeight) {
            System.out.println("Warning: Weight exceeds maximum capacity of " + maxWeight + " lbs!");
            return false;
        }
        
        isOccupied = true;
        swingCount++;
        System.out.println("Enjoy your swing! This is use #" + swingCount + " today.");
        return true;
    }
    
    /**
     * Behavior method WITH parameters
     * Adjusts the chain length of the swing
     * @param newLength The new chain length in feet
     */
    public void adjustChainLength(double newLength) {
        if (newLength < 3.0 || newLength > 10.0) {
            System.out.println("Chain length must be between 3 and 10 feet for safety!");
        } else {
            chainLength = newLength;
            System.out.println("Chain length adjusted to " + chainLength + " feet.");
        }
    }
    
    /**
     * Behavior method WITHOUT parameters
     * Simulates a person getting off the swing
     */
    public void getOff() {
        if (!isOccupied) {
            System.out.println("The swing is already empty!");
        } else {
            isOccupied = false;
            System.out.println("Thanks for using the swing! Come back soon!");
        }
    }
    
    /**
     * Behavior method WITHOUT parameters
     * Performs a safety inspection on the swing
     */
    public void performSafetyCheck() {
        System.out.println("\n--- Safety Inspection Report ---");
        System.out.println("Chain Length: " + chainLength + " feet - " + 
                         (chainLength >= 3.0 && chainLength <= 10.0 ? "PASS" : "FAIL"));
        System.out.println("Seat Material: " + seat.getMaterial());
        System.out.println("Weight Capacity: " + maxWeight + " lbs");
        System.out.println("Current Status: " + (isOccupied ? "In Use" : "Available"));
        System.out.println("Total Uses Today: " + swingCount);
        System.out.println("Overall Status: SAFE FOR USE");
        System.out.println("-------------------------------\n");
    }
    
    /**
     * Returns a string representation of the Swing
     * @return Description of the swing
     */
    @Override
    public String toString() {
        return "Swing [Color: " + color + 
               ", Chain Length: " + chainLength + " ft" +
               ", " + seat.toString() +
               ", Max Weight: " + maxWeight + " lbs" +
               ", Status: " + (isOccupied ? "Occupied" : "Available") +
               ", Uses Today: " + swingCount + "]";
    }
}