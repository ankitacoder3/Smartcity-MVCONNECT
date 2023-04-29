/*
 Design Pattern used- Singleton Pattern
 Design Principles used- SRP, OCP
 Architechture Pattern- MVC
*/

package movico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Malls {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String open;
    private String close;

    private static Malls instance; // Singleton private static instance

    private Malls() {
        // Private constructor to prevent instantiation from outside this class
    }

    // Lazy initialization of Singleton instance
    public static Malls getInstance() {
        if (instance == null) {
            synchronized (Malls.class) {
                if (instance == null) {
                    instance = new Malls();
                }
            }
        }
        return instance;
    }

    // Other methods

    @Override
    public String toString() {
        return "Malls [id=" + id + ", name=" + name + ", Address=" + address + ", open=" + open + ", close="
                + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
                + ", getOpen()=" + getOpen() + ", getClose()=" + getClose() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    //getter functions or methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    //setter functions or methods

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setClose(String close) {
        this.close = close;
    }
}