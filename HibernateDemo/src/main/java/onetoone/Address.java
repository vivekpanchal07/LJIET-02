package onetoone;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "one2oneAddress")
public class Address implements Serializable {
    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Id
    @Column(name = "addressID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int address_id;
    String state,city;
}
