/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * Construct a House.
   * @param name house name
   * @param address house address
   * @param nFloors number of floors
   * @param hasDiningRoom whether the house includes a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Does the house have a dining room?
   * @return true if the house has a dining room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Number of residents currently in the house
   * @return resident count
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Move a student into the house
   * @param s student to move in
   */
  public void moveIn(Student s) {
    if (!this.residents.contains(s)) {
      this.residents.add(s);
    }
  }

  /**
   * Move a student out of the house
   * @param s student to move out
   * @return remove the student
   */
  public Student moveOut(Student s) {
    if (this.residents.contains(s)) {
      this.residents.remove(s);
      return s;
    } else {
      return null;
    }
  }
  
  /**
   * Check if the student a resident of the house?
   * @param s student to check
   * @return true if student is a resident
   */
  public boolean isResident(Student s){
    return this.residents.contains(s);
  }


  public static void main(String[] args) {
    House myHouse = new House("King House", "180 Elm Street Northampton, MA 01063", 4, true);
    System.out.println(myHouse);
  }
}