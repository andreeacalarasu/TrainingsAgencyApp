package model;

import java.time.LocalDateTime;


public class Employee {
    private int id;
    private String cnp;
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNo;
    private LocalDateTime birthDate;
    private LocalDateTime employmentDate;
    private String address;
    private String position;
    private String department;
    private double monthlySalary;


    public Employee(int id, String cnp, String firstName, String lastName, String email, String telephoneNo,
                    LocalDateTime birthDate, LocalDateTime employmentDate, String address, String position, String department,
                    double monthlySalary){
        this.id = id;
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNo = telephoneNo;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
        this.address = address;
        this.position = position;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNo() { return telephoneNo; }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDateTime employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public boolean equals(Object o) {
        Employee hero = (Employee) o;
        if ( this.cnp.equals(hero.getCnp())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prim = 31;
        result = result * prim + cnp.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return id + ", " + cnp + ", " + firstName + ", " + lastName + ", " + email + ", " + telephoneNo + ", " + birthDate +
                ", " + employmentDate + ", " + address + ", " + position + ", " + department + ", " + monthlySalary
                + "\n";
    }
}
