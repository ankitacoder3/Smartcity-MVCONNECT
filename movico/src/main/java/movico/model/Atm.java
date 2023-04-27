package movico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atm implements Cloneable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String address;
//prototype
public Atm() {
  super();
}

public Atm(int id, String name, String address) {
  super();
  this.id = id;
  this.name = name;
  this.address = address;
}

//Implementing the clone() method to create a copy of the object
@Override
public Object clone() {
  try {
      return super.clone();
  } catch (CloneNotSupportedException e) {
      return new Atm(this.id, this.name, this.address);
  }
}

//Getters and setters
public int getId() {
  return id;
}

public void setId(int id) {
  this.id = id;
}

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public String getAddress() {
  return address;
}

public void setAddress(String address) {
  this.address = address;
}
}

