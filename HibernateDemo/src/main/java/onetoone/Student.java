package onetoone;

import jakarta.persistence.*;
import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
@Entity
@Table(name = "one2oneStudent")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int sid;
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressID")
    private Address address;
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
