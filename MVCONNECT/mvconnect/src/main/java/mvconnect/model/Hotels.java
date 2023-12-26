package mvcity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String address;

    private static Hotels instance; // Singleton instance

    private Hotels() {
        // Private constructor to prevent instantiation
    }

    // Lazy initialization of Singleton instance
    public static Hotels getInstance() {
        if (instance == null) {
            synchronized (Hotels.class) {
                if (instance == null) {
                    instance = new Hotels();
                }
            }
        }
        return instance;
    }

    // Rest of the class implementation
    // ...

    @Override
    public String toString() {
        return "Hotels [id=" + id + ", name=" + name + ", email=" + email + ", Address=" + address
                + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
                + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

