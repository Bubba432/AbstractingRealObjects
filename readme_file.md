# Playground Swing Abstraction Project

## 📋 Project Description
This project models a real-world playground swing using Object-Oriented Programming principles in Java. The program demonstrates abstraction by creating classes that represent a swing and its components.

## 📁 Project Structure
The project consists of three Java classes:

### 1. **Seat.java** (Secondary Class)
- Represents the seat component of a swing
- Contains 1 instance variable: `material`
- Includes getter and setter methods
- Fully documented with Javadoc comments

### 2. **Swing.java** (Main Object Class)
- Represents a complete playground swing
- **6 Instance Variables**:
  - `Seat seat` - Object from the Seat class
  - `double chainLength` - Length of chains in feet
  - `String color` - Color of the swing
  - `int maxWeight` - Maximum weight capacity in pounds
  - `boolean isOccupied` - Current occupancy status
  - `int swingCount` - Number of uses today

- **2 Overloaded Constructors**:
  - Default constructor (creates a standard blue swing)
  - Parameterized constructor (creates a custom swing)

- **Accessor and Mutator Methods**: For all 6 instance variables

- **4 Behavior Methods**:
  - `getOn(int personWeight)` - WITH parameters
  - `adjustChainLength(double newLength)` - WITH parameters
  - `getOff()` - WITHOUT parameters
  - `performSafetyCheck()` - WITHOUT parameters

- **toString() Method**: Provides a complete description of the swing

### 3. **SwingTester.java** (Tester Class)
- Contains the `main()` method
- Creates objects using both constructors
- Prints objects using `System.out.println()`
- Calls methods with and without parameters on each object
- Demonstrates all functionality

## 🎨 Class Diagram

```
┌─────────────────────────┐
│        Seat             │
├─────────────────────────┤
│ - material: String      │
├─────────────────────────┤
│ + Seat(String)          │
│ + getMaterial(): String │
│ + setMaterial(String)   │
│ + toString(): String    │
└─────────────────────────┘
           △
           │ contains
           │
┌──────────────────────────────────┐
│           Swing                  │
├──────────────────────────────────┤
│ - seat: Seat                     │
│ - chainLength: double            │
│ - color: String                  │
│ - maxWeight: int                 │
│ - isOccupied: boolean            │
│ - swingCount: int                │
├──────────────────────────────────┤
│ + Swing()                        │
│ + Swing(String, double,          │
│         String, int)             │
│ + getSeat(): Seat                │
│ + getChainLength(): double       │
│ + getColor(): String             │
│ + getMaxWeight(): int            │
│ + isOccupied(): boolean          │
│ + getSwingCount(): int           │
│ + setSeat(Seat)                  │
│ + setChainLength(double)         │
│ + setColor(String)               │
│ + setMaxWeight(int)              │
│ + setOccupied(boolean)           │
│ + setSwingCount(int)             │
│ + getOn(int): boolean            │
│ + adjustChainLength(double)      │
│ + getOff()                       │
│ + performSafetyCheck()           │
│ + toString(): String             │
└──────────────────────────────────┘
           △
           │ uses
           │
┌──────────────────────────────────┐
│       SwingTester                │
├──────────────────────────────────┤
│ + main(String[])                 │
└──────────────────────────────────┘
```
## 📝 Features Demonstrated
- **Encapsulation**: All instance variables are private with public getters/setters
- **Object Composition**: The Swing class contains a Seat object
- **Constructor Overloading**: Multiple ways to create Swing objects
- **Method Overloading**: Different behavior based on parameters
- **Data Validation**: Safety checks for weight limits and chain length
- **State Management**: Tracking occupancy and usage count

## 👨‍💻 Author
David H.

## 📅 Date
November 13, 2025