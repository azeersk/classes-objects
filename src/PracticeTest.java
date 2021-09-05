import java.util.Scanner;
public class PracticeTest {
    public static void main(String[] args){
        Scanner inputOf = new Scanner(System.in);
        ClassTest obj = new ClassTest();
        System.out.println("Please enter Employee Id: ");
        int EId = inputOf.nextInt();
        System.out.println("Please enter Employee Salary: ");
        int ESalary = inputOf.nextInt();
        System.out.println("Please enter Employee Name: ");
        String EName = inputOf.next();
        System.out.println("Please enter Employee Id: ");
        int E1Id = inputOf.nextInt();
        System.out.println("Please enter Employee Salary: ");
        int E1Salary = inputOf.nextInt();
        System.out.println("Please enter Employee Name: ");
        String E1Name = inputOf.next();
        obj.EmployeeDetails(EId,EName,ESalary);
        System.out.println("============================================");
        obj.EmployeeDetails(E1Id,E1Name,E1Salary);
    }
}

class ClassTest{
    int EmpId;
    String EmpName;
    int EmpSalary;
    static String CEO = "Sunder pichai";
    static String CompanyName = "Google";
    public void EmployeeDetails(int EmpId,String EmpName,int EmpSalary){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpSalary = EmpSalary;
        System.out.println("EmpId: "+ EmpId);
        System.out.println("EmpName: "+EmpName);
        System.out.println("EmpSalary: "+ EmpSalary);
        System.out.println(CEO);
        System.out.println(CompanyName);
    }
}
