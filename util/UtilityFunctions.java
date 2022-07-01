package util;

import java.util.Scanner;

public class UtilityFunctions {
    static int perHourWage = 20;
    static int permEmpMaxOneDayEffort = 8;
    static int partTimeEmployeeMaxOneDayEffort = 4;
    static int DailyAttendanceCheck;
    /*
    Use-Case 1 Logic Whether Employee Is Present Or Absent
    dailyAttendance method generates A Random Number & Checks If Random Value Is Greater Than 0.5
    Employee Is Present OtherWise He/She is Absent
    */
    public static void dailyAttendance(){
        double Attendance = Math.random();
        if(Attendance > 0.5){
            DailyAttendanceCheck = 1;
            System.out.println("Employee is Present ");
            System.out.println("Employee Daily Wage Is : " + dailyWageCalc());
        }
        else{
            DailyAttendanceCheck = 0;
            System.out.println("Employee was Absent today that's why his today's Wage is : 0");
        }
    }
    /*
    Use-Case 3 Logic for checking whether employee is Part time Or Permanent
    You Have to Enter P for permanent or T for Temporary
    */
    public static int dailyWageCalc(){
        int dailyWage = 0;
        System.out.println("Please enter P is if the employee is Permanent Employee or T for Temporary Employee");
        Scanner scan = new Scanner(System.in);
        String tempOrPerm = scan.next();
        if(tempOrPerm.equals("P")){ //Press P if the Employee is Permanent
            dailyWage = perHourWage * permEmpMaxOneDayEffort;
        }else if(tempOrPerm.equals("T")){   //Press T if the employee is Temporary
            dailyWage = partTimeEmployeeMaxOneDayEffort * perHourWage;
        }else{  //if any other input is provided
            System.out.println("Please Provide only authorized input");
        }
        return dailyWage;
    }
}
