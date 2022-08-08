
package kauhospitalsystem;

public class Room {
    
  private int roomNo;
  private String floor;
  private String block;
  private double charges;
  
  public Room (int roomNo,  String floor, String block, double charges){
      
    this.roomNo = roomNo;
    this.floor = floor;
    this.block = block;
    this.charges = charges;
      
  }
    
  
  //Getters---------------
  public int getRoomNo (){
      return roomNo;
  }
  
  public String getFloor (){
      return floor;
  }
  
  public String getBlock (){
      return block;
  }
  
  public double getCharges (){
      return charges;
  }
  
  
  //Setters--------------------------
  public void setRoomNo (int roomNo){
      this.roomNo = roomNo;
  }
  
  public void setFloor (String floor){
      this.floor = floor;
  }
  
  public void setBlock (String block){
      this.block = block;
  }
  
  public void setCharges (double charges){
      this.charges = charges;
  }
    
  
  //----------
  public String toString (){
      return "\tRoom No: " + getRoomNo() +  "\n\tLocated in floor: " + getFloor() + "\n\tBlock :" + getBlock() + "\n\tCharges: " + getCharges();
  }

}
