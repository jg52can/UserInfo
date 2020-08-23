package project.logic;
import project.logic.model.User;

public class UserDetails {


    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }

    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO : RQ - 2
    public static Double SalaryAccumulated(User user){
        int age = 0;
        String province=user.getAddress().getProvince();

        if(province=="Ontario"){
           age = 58;
        }
        else if(province=="Quebec"){
            age = 55;
        }

        int remainingAge=age-user.getAge();
        double salaryHike=0,totalSalary=0;
        salaryHike=user.getSalary();
        for(int i=1;i<=remainingAge;i++){
            salaryHike=salaryHike+salaryHike*0.02 ;
            totalSalary+=salaryHike;
        }
        return totalSalary;
    }


}
