/**
 * Represents a seat on a playground swing.
 * This is the secondary class that will be used as an instance variable
 * in the main Swing class.
 * 
 * @author Your Name
 * @collaborator ChatGPT
 * @version 1.0
 */
public class Seat {
    // Instance variable
    private String material;
    
    /**
     * Constructor to create a Seat with a specified material
     * @param material The material the seat is made of (e.g., "rubber", "plastic", "wood")
     */
    public Seat(String material) {
        this.material = material;
    }
    
    /**
     * Gets the material of the seat
     * @return The seat material
     */
    public String getMaterial() {
        return material;
    }
    
    /**
     * Sets the material of the seat
     * @param material The new material for the seat
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * Returns a string representation of the Seat
     * @return Description of the seat
     */
    @Override
    public String toString() {
        return "Seat made of " + material;
    }
}