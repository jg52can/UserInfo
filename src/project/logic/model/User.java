package project.logic.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
    private String fName;
    // TODO : RQ - 1
    private String dob;
    private String lName;
    private Address address;
    private Double salary;
    private int age;



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy/MM/dd" );
        LocalDate localDate = LocalDate.parse( dob , formatter );
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();

        LocalDate l = LocalDate.of(year, month, dayOfMonth); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets today's date
        Period diff = Period.between(l, now); //difference between the dates is calculated
        age = diff.getYears();
        return age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", age=" + dob +
                ", lName='" + lName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
