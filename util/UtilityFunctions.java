package util;

public class UtilityFunctions {
    /*
    Use-Case 1 Logic Whether Employee Is Present Or Absent
    dailyAttendance method generates A Random Number & Checks If Random Value Is Greater Than 0.5
    Employee Is Present OtherWise He/She is Absent
    */
    public static void dailyAttendance(){

        int DailyAttendanceCheck;
        double Attendance = Math.random();
        if(Attendance > 0.5){
            DailyAttendanceCheck = 1;
            System.out.println("Employee is Present ");
        }
        else{
            DailyAttendanceCheck = 0;
            System.out.println("Employee was Absent today that's why his today's Wage is : 0");
        }
    }
}
