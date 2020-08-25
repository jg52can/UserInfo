package project.logic;

import project.logic.model.*;
import project.logic.model.User;

public class UserMain {

    public static void main(String[] args){
        User user1=new User();
        user1.setfName("Rahul");
        user1.setlName("Singh");
        //user1.setAge(25);
        user1.setDob("1994/04/04");
        user1.setSalary(3500.00);
        Address address=new Address();
        address.setCity("Montreal");
        address.setCountry("CA");
        address.setProvince("Quebec");
        address.setStreetName("Saint Mark");
        user1.setAddress(address);



        User user2=new User();
        user2.setfName("Nikita");
        user2.setlName("John");
        //user2.setAge(35);
        user2.setDob("1984/08/10");
        user2.setSalary(2500.00);
        Address address2=new Address();
        address2.setCity("Ottawa");
        address2.setCountry("CA");
        address2.setProvince("Ontario");
        address2.setStreetName("Saint Matheiu");
        //fix web-4
        user2.setAddress(address2);


        User user3=new User();
        user3.setfName("George");
        user3.setlName("Thomas");
        //fix web-5
        Address address3=new Address();
        address3.setCity("Toronto");
        address3.setCountry("CA");
        address3.setProvince("Ontario");
        user3.setAddress(address3);
        //user3.setAge(30);
        user3.setDob("1988/01/23");
        user3.setSalary(1800.00);



        System.out.println(user1.toString());
        //TODO : WEB-4
        System.out.println(user2.toString());


        Double salaryAccumulatedUser1= UserDetails.SalaryAccumulated(user1);
        System.out.println(salaryAccumulatedUser1);
        Double salaryAccumulatedUser2= UserDetails.SalaryAccumulated(user2);
        System.out.println(salaryAccumulatedUser2);

        //TODO : WEB-5
        //fix web-5
        try {
            Boolean isCanadian = UserDetails.VerifyCountry(user3);
            System.out.println(UserDetails.FullName(user3) + " is " + isCanadian);
        } catch (NullPointerException e) {
            System.out.println("Entered value is "+e.getMessage()); ;
        }


    }
}
