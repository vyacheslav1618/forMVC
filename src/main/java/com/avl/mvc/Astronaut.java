
package com.avl.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Astronaut {
    @Size(min = 2, max=1000, message = "name must be minimum 2 symbols")
    private String name;
    @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 300, message = "Must be greater than 299")
    @Max(value = 10000, message = "Must be less than 10001")
    private int salary;
    private String department;
    private Map<String, String> ships;
    private String sex;
    private String[] languages;

    //change constructor for using <form:options
    public Astronaut() {
        ships = new HashMap<>();
        ships.put("InterPlanetaryJetPack IpJp-16", "IpJp-16");
        ships.put("HeavyWhale HW-2000", "HW-2000");
        ships.put("FastHawk FH-4", "FH-4");
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getShips() {
        return ships;
    }

    public void setShips(Map<String, String> ships) {
        this.ships = ships;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Astronaut{" + "name=" + name + ", surname=" + surname 
                + ", salary=" + salary + ", department=" + department + '}';
    }
}
