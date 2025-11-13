/**
 * Tester class to demonstrate the functionality of the Swing class.
 * This class creates Swing objects and tests their methods.
 * 
 * @author David H.
 * @collaborator ChatGPT
 * @version 1.0
 */
public class SwingTester {
    /**
     * Main method to test the Swing class
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Playground Swing Testing Program ===\n");
        
        // Create a swing using the default constructor
        System.out.println("Creating Swing 1 (Default Constructor):");
        Swing swing1 = new Swing();
        System.out.println(swing1);
        System.out.println();
        
        // Create a swing using the overloaded constructor
        System.out.println("Creating Swing 2 (Custom Constructor):");
        Swing swing2 = new Swing("plastic", 7.5, "red", 200);
        System.out.println(swing2);
        System.out.println();
        
        // Test behavior method WITH parameters on swing1
        System.out.println("--- Testing Swing 1 ---");
        swing1.getOn(120);  // Method with parameters
        System.out.println();
        
        // Test behavior method WITHOUT parameters on swing1
        swing1.performSafetyCheck();  // Method without parameters
        
        // Test behavior method WITH parameters on swing2
        System.out.println("--- Testing Swing 2 ---");
        swing2.adjustChainLength(8.0);  // Method with parameters
        System.out.println();
        
        // Test behavior method WITHOUT parameters on swing2
        swing2.getOff();  // Method without parameters
        System.out.println();
        
        // Additional testing to show more functionality
        System.out.println("--- Additional Testing ---");
        
        // Test getting on when already occupied
        swing1.getOn(100);
        System.out.println();
        
        // Get off swing1 and try again
        swing1.getOff();
        swing1.getOn(100);
        System.out.println();
        
        // Test weight limit
        swing2.getOn(250);
        System.out.println();
        
        // Test chain length adjustment with invalid value
        swing2.adjustChainLength(12.0);
        System.out.println();
        
        // Print final state of both swings
        System.out.println("--- Final State ---");
        System.out.println("Swing 1: " + swing1);
        System.out.println("Swing 2: " + swing2);
    }
}