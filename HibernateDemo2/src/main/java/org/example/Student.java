package org.example;
import javax.persistence.*;
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student(){
        super();
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

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
