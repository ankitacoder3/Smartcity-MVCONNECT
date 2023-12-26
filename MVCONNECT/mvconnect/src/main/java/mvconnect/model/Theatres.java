package mvcity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theatres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private long contact;

    private static Theatres instance; // Singleton instance

    private Theatres() {
        // Private constructor to prevent instantiation
    }

    // Lazy initialization of Singleton instance
    public static Theatres getInstance() {
        if (instance == null) {
            synchronized (Theatres.class) {
                if (instance == null) {
                    instance = new Theatres();
                }
            }
        }
        return instance;
    }

    // Rest of the class implementation
    // ...

    @Override
    public String toString() {
        return "Theatres [id=" + id + ", name=" + name + ", contact=" + contact + ", Address="
                + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getContact()="
                + getContact() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
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

    public void setName(String tname) {
        this.name = tname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String taddress) {
        this.address = taddress;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}


