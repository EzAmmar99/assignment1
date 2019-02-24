/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author Ez Ammar
 */
public class Employee {

    private String name;
    private String department;
    private double salary;
    private float bounas;
    private static int count = 0;

    public Employee() {
        count++;
    }

    public Employee(String name, String department, double salary) {
        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(float bounas, double salary) {
        this.salary = salary * bounas;
    }

}
