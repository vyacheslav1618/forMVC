
package com.avl.mvc;

public class Astronaut {
    
    private String name;
    private String surname;
    private String department;
    private int salary;

    public Astronaut() {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Astronauts{" + "name=" + name + ", surname=" + surname 
                + ", department=" + department + ", salary=" + salary + '}';
    }

    
    
}
