public class Building implements BuildingRequirements {

    /** 
     * Name of the building
     */
    protected String name = "<Name Unknown>";

    /** 
     * The building's address
     */
    protected String address = "<Address Unknown>";

    /** 
     * Number of floors in the building
     */
    protected int nFloors = 1;

    /**
     * Construct a Building
     * @param name building name (if null, a default is kept)
     * @param address building address (if null, a default is kept)
     * @param nFloors number of floors (must be >= 1)
     * @throws RuntimeException if nFloors < 1
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Get the building's name
     * @return name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the building's address
     * @return address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Get the number of floors in the building
     * @return number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Description of the building
     * @return description
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "- story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}

