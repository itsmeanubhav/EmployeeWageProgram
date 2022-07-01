package util;

import java.util.Scanner;

public class UtilityFunctions {
    static int perHourWage = 20;
    static int permEmpMaxOneDayEffort = 8;
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
    Use-Case 2 Logic To Calculate The DailyWagesOf Employees
    DailyWageCalc() method is being used to Calculate the daily Wage of an employee
    */
    public static int dailyWageCalc(){
        int dailyWage = 0;

        dailyWage = perHourWage * permEmpMaxOneDayEffort;
        return dailyWage;
    }
}
