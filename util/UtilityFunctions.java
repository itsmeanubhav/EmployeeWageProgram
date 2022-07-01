package util;

import java.util.Scanner;

public class UtilityFunctions {
    static int perHourWage = 20;
    static int permEmpMaxOneDayEffort = 8;
    static int partTimeEmployeeMaxOneDayEffort = 4;
    static int DailyAttendanceCheck;
    int dailyWage = 0;
    int max_WorkingHours = 100;
    int max_NoOfDays = 20;
    int monthlyWage;
    int noOfDays;
    int noOfHours;
    Scanner scanner = new Scanner(System.in);
    /*
    Use-Case 1 Logic Whether Employee Is Present Or Absent
    dailyAttendance method generates A Random Number & Checks If Random Value Is Greater Than 0.5
    Employee Is Present OtherWise He/She is Absent
    */
    public void dailyAttendance(){
        double Attendance = Math.random();
        if(Attendance > 0.5){
            DailyAttendanceCheck = 1;
            System.out.println("Employee is Present ");
            System.out.println("Employee Daily Wage Is : " + dailyWageCalc());
            System.out.println("Employee Monthly Wage Is : " + monthlyWage());
        }
        else{
            DailyAttendanceCheck = 0;
            System.out.println("Employee was Absent today that's why his today's Wage is : 0");
        }
    }
    /*
    Use-Case 3 & 4 Logic for checking whether employee is Part time Or Permanent
    You Have to Enter P for permanent or T for Temporary
    */
    public int dailyWageCalc(){
        System.out.println("Please enter P is if the employee is Permanent Employee or T for Temporary Employee");
        String tempOrPerm = scanner.next();
        //UC-4 Adding Switch Statement to Check whether the employee is Permanent or Temporary.
        switch(tempOrPerm){
            case "P" :
            case "p" :
                dailyWage = perHourWage * permEmpMaxOneDayEffort;
                System.out.println("Maximum Monthly Wage Possible For Permanent Employee Is : " + maximumWagePossible());
                break;
            case "T" :
            case "t" :
                dailyWage = partTimeEmployeeMaxOneDayEffort * perHourWage;
                System.out.println("Maximum Monthly Wage Possible For Temporary Employee Is : " + maximumWagePossible());
                break;
           default :
                System.out.println("Please Provide only authorized input");
                System.exit(0);
        }
        return dailyWage;
    }
        /*
        Use-Case 5 Logic for Calculating Monthly Wages
        Assuming there are 20 working days per month ,100 working hours per month
        */
    public int monthlyWage(){
        System.out.println(" Please Enter Number Of Days Employee Had Worked");
        noOfDays = scanner.nextInt();
        System.out.println(" Please Enter Number Of Hours Employee Had Worked");
        noOfHours = scanner.nextInt();

        if(noOfHours  <= max_WorkingHours && noOfDays <= max_NoOfDays){
            monthlyWage = noOfDays * noOfHours * dailyWage;
        }else if(noOfDays <= max_NoOfDays){
            System.out.println("Number Of Hours Worked By Employee Could Not Be More Than 100 Setting Maximum Value For Number Of Hours Worked as 100");
            monthlyWage = 100 * noOfDays * dailyWage;
        }else{
            System.out.println("Number Of Days Worked By Employee Could Not Be More Than 20 Setting Maximum Value For Number Of Days Worked as 20");
            monthlyWage = noOfHours * 20 * dailyWage;
        }
        return monthlyWage;
    }
            /*
            Use-Case 6 Logic for Calculating Maximum Monthly Wage for Mentioned Employee
            Assuming there are 20 working days per month ,100 working hours per month
            Calling dailyWage from dailyWageCalc()
            */
    public int maximumWagePossible(){
        int maximumMonthlyWage = 100 * 20 * dailyWage;
        return maximumMonthlyWage;
    }
}
