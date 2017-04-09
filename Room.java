/**
 * Room.java
 * for Adventure Time
 * Created by: Adrianna Valle, Jessenia Aguilar-Hernandez & Lauren Luo 
 * 
 * A class that creates room objects simulating rooms that contain connect to
 * other rooms through door objects and which hold keys that help the user traverse through
 * the graph. This Class takes in the room image name along with the list of keys that
 * correspond to the locked doors.
 */
import java.util.*;

public class Room implements Comparable<Room> {
  //instance variables
  private String img;
  private Key[] karray;//holds the keys in the room
  private final int DEFAULT_CAPACITY = 10;
  
  /**Constuctor takes in imagefile name, and the active key in the room */
  public Room(String imgFile, LinkedList<Key> activeKeys){ 
    img = imgFile;
    
    karray = new Key[DEFAULT_CAPACITY]; //each room will always have 10 keys (1 active, 9 inactive)
    for (int i = 0; i < activeKeys.size(); i++) {
      karray[i] = activeKeys.get(i);
    }
    
    //assigns random keys to the remaining 9 key slots in karray
    for (int i = activeKeys.size(); i < karray.length; i++) {
      Key temp = GameMap.getRandomKey(); 
      while(contains(temp)) {
        temp = GameMap.getRandomKey();
      }
      karray[i] = temp.copyKey();
    }
    
    /* Shuffles the key placements so that all the active keys are not
     in the beginning of the list */
    Random ran = new Random();
    for(int j = 0; j<karray.length ; j++)
    {
      int swapVal = ran.nextInt(karray.length-1)+1;                         
      Key tempEle = karray[swapVal];
      karray[swapVal] = karray[karray.length-1-j];
      karray[karray.length-1-j] = tempEle;   
    }
  }
  
 /** Returns the name of the room. */
  public String getRoomName() {
    return img.substring(0,img.indexOf("."));
  }
  
  /** GETTER: Returns the list of keys in the room */
  public Key[] getRoomKeys(){
    return karray;
  }
  
  /** Returns whether the key name is valid */
  public boolean validKey(String keyString) {
    for (Key k: karray) {
      if (k.getName().toLowerCase().equalsIgnoreCase(keyString)) {
        return true;
      }
    }
    return false;
  }
  
  /** Checks to see if the key is in the room. */
  private boolean contains(Key kIn) {
    for (Key k: karray) {
      if (kIn.equals(k)) {
        return true;
      }
    }
    return false;
  }
  
  /** Returns the Key with the corresponding key name. */
  public Key getKey(String nameOfSelectedKey) {
    for (int i = 0; i < karray.length; i++) {
      if (karray[i].getName().equalsIgnoreCase(nameOfSelectedKey)) {
        return karray[i];
      }
    }
    return null;
  }
  
  /**Return  an int based on the string compareTo of room names. Used to compare objects of 
    * this type. */
  public int compareTo(Room other){
    return getRoomName().compareTo(other.getRoomName());
  }
  
  /** Returns String representation of the object. For testing purposes */
  public String toString() {
    return img.substring(0,img.indexOf("r"));
  }
  
  //testing
  public static void main(String[] args){
//    Key k1 = new Key("apple","jals;fjdlkf", "adfhkjsdhfj");
//    Key k2 = new Key("toy","jdsl;jaf", "jdsklfjds");
//    
//    Room r1 = new Room("somefilename", k1);
//    
//    System.out.println("6 - ");
//    System.out.println(r1.getKey(0).getName());
//    
//    Room r2 = r1;
//    
//    System.out.println("Should be 0 - "+r2.compareTo(r1));
//    
//    Room r3 = new Room("somefilename", k2);
//    r3.addKey(k1);
//    
//    System.out.println("Should be 0 - "+r2.compareTo(r3));
//    
//    Room r4 = new Room("somefilename", k2);
//    r4.addKey(k1);
//    r4.addKey(k1);
//    System.out.println("Should be less than 0 : "+r2.compareTo(r4));
//    
//    Room r5 = new Room("anotherfilename",k1);
//    r5.addKey(k1);
//    System.out.println("Should be greater than 0 ? "+r2.compareTo(r5));
  }
}
