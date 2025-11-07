/* This is a stub for the Cafe class */
public class Cafe extends Building {

    // Attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {

        this.nCoffeeOunces = startingCoffee;
        this.nSugarPackets = startingSugar;
        this.nCreams = startingCream;
        this.nCups = startingCups;

        System.out.println("You have built a cafe: ☕");
    }
    
    // Method 
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        nCups -= 1;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;

    }        


    public static void main(String[] args) {
        new Cafe();
    }
    
}
