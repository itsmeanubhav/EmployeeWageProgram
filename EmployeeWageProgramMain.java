import util.UtilityFunctions;

public class EmployeeWageProgramMain {
    static int perHourWage = 20;        //Default Value for per Hour Wage
    static int permEmpMaxOneDayEffort = 8; //Default Max Hours for every Permanent employee to work
    static int partTimeEmployeeMaxOneDayEffort = 4; //Default Max Hours for every Temporary employee to work
    public static void main(String[] args) {
        System.out.println("*****Welcome To Employee Wage Computation Program On Master Branch*********");

        UtilityFunctions.dailyAttendance();

    }
}
