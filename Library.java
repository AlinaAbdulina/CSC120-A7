/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

  private Hashtable<String, Boolean> collection;

    /**
     * Construct a Library
     * @param name library name
     * @param address library address
     * @param nFloors number of floors
     */
    public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }


    /** 
     * Add a title to the collection 
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /**
     * Remove a title from the collection and return it back
     * @param title title to remove
     * @return the removed title
     */
    public String removeTitle(String title) { 
    if (this.collection.containsKey(title)) {
      this.collection.remove(title);
      return title;
    }
    return null;
  }
  
    /** 
     * Check out a title
     */
    public void checkOut(String title) {
    if (this.collection.containsKey(title)) {
      this.collection.replace(title, false);
    }
  }
    
    /** 
     * Return a book
     */
    public void returnBook(String title) {
    if (this.collection.containsKey(title)) {
      this.collection.replace(title, true);
    }
  }

    /**
     * Check whether the collection contains the title
     * @param title title to check
     * @return true if present
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    }

    /**
     * Check whether a title is available
     * @param title title to check
     * @return availability status
     */
    public boolean isAvailable(String title) {
    if (this.collection.containsKey(title)) {
      return this.collection.get(title);
    }
    return false;
  }
  
    /** 
     * Print the full collection
     */
    public void printCollection() {
        System.out.println("Library Collection:");
        for (String title : this.collection.keySet()) {
            boolean isAvailable = this.collection.get(title);
            String status;
            if (isAvailable) {
                status = "Available";
            } else {
                status = "Checked Out";
            }
            
            System.out.println("- " + title + ": " + status);
        }
    }



    public static void main(String[] args) {
    Library myLibrary = new Library("Neilson", "7 Neilson Drive", 4);
    myLibrary.addTitle("The Great Gatsby");
    myLibrary.printCollection();
    myLibrary.checkOut("The Great Gatsby");
    myLibrary.printCollection();
  }
}