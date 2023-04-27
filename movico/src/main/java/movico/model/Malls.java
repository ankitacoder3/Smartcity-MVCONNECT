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

    private static Malls instance; // Singleton instance

    private Malls() {
        // Private constructor to prevent instantiation
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

    // Rest of the class implementation
    // ...

    @Override
    public String toString() {
        return "Malls [id=" + id + ", name=" + name + ", Address=" + address + ", open=" + open + ", close="
                + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
                + ", getOpen()=" + getOpen() + ", getClose()=" + getClose() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
}