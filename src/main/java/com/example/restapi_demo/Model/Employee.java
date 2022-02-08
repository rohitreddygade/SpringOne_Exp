package com.example.restapi_demo.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    private @Id @GeneratedValue Long Id;
    private String firstname;
    private String lastname;
    private String description;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // private Employee(){}

    public Employee(String firstname, String lastname, String description){
        this.firstname = firstname;
        this.lastname = lastname;
        this.description = description;
    }

    public boolean equals(Object o){
        if(this == o ) return true;
        if(o == null || getClass() != getClass()) return false;
        
        Employee employee = (Employee) o;
        return  Objects.equals(Id, employee.Id) &&
                Objects.equals(firstname, employee.firstname) &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(description, employee.description);

    }

    @Override
    public int hashCode(){
        return Objects.hash(Id,firstname,lastname);
    }

    @Override
    public String toString(){
        return "Employee{" +
			"id=" + Id +
			", firstName='" + firstname + '\'' +
			", lastName='" + lastname + '\'' +
			", description='" + description + '\'' +
			'}';
    }
}
