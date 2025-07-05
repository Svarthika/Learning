package practice.Task_jul4.Program1_2_3;

public class Employee {
    String Employee_name;
    int EmpId;
    String Organization = "Compnay123";

    Employee(String name, int id) {
        Employee_name = name;
        EmpId = id;
    }

    void EmployeeDetails() {
        System.out.println("Employee_name\t" + Employee_name);
        System.out.println("Employee_Id\t" + EmpId);

    }
}

class Employee_Constructor_Exm extends Employee {
    Employee_Constructor_Exm() {
        super("Tester1", 003);
    }

    public static void main(String[] args) {
        Employee_Constructor_Exm e1 = new Employee_Constructor_Exm();
        e1.Display_EmployeeInfo();

    }

    void Display_EmployeeInfo() {
        super.EmployeeDetails();
        System.out.println("Organization\t"+super.Organization);
    }


}
