/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

  // Attributes 
  private Hashtable<String, Boolean> collection;

    public Library() {
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

    // Methods 
    // update collection every time we add/remove a title
    public void addTitle(String title){
      collection.put(title, true);
    }
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    } 
  
    // // check a book out or return it
    // public void checkOut(String title){

    // }
    
    // public void returnBook(String title){

    // }



    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
      return collection.containsTitle(title);

    }

    // // prints out the entire collection in an easy-to-read way (including checkout status) 
    // public void printCollection(){

    // } 

    public static void main(String[] args) {
      new Library();
    }
  
  }