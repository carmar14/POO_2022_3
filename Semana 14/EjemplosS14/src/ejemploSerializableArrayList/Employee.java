/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploSerializableArrayList;

import java.io.Serializable;
 
public class Employee implements Serializable {
 
    String id;
    String firstName;
    String lastName;
 
    //Getters and setters
 
    public Employee(String id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}