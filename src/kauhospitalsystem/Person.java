
package kauhospitalsystem;

public class Person {
   
 int id;
 String name, nationality;
 char gender;
 int phone;
 
 public Person (int id , String name , String nationlity , char gender , int phone){
     
     this.id = id;
     this.name = name;
     this.nationality = nationlity;
     this.gender = gender;
     this.phone = phone;
     
 }
   
 
 
public int getId (){
    return id;
}

public String getName (){
    return name;
}

public String getNatiolity (){
    return nationality;
}

public char getGender (){
    return gender;
}

public int getPhone (){
    return phone;
}



public void setId (int id){
    this.id = id;
}

public void setName (String name){
    this.name = name;
}

public void setNatiolity (String nationality){
    this.nationality = nationality;
}

public void setGender (char gender){
    this.gender = gender;
}

public void getphone (int phone){
    this.phone = phone;
}

 

public String toString(){
    return "\tID: " + getId() + "\n\tName: " + getName() + "\n\tNationality :" + getNatiolity() + "\n\tGender: " + getGender() +  "\n\tPhone: " + getPhone();
}
 



}
