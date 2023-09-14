import java.util.Scanner;

class Employee {
    private int eNo;
    private String eName;
    private double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int getENo() {
        return eNo;
    }

    public String getEName() {
        return eName;
    }

    public double getESalary() {
        return eSalary;
    }
}

public class EmployeeArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee #" + (i + 1) + " number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee #" + (i + 1) + " name: ");
            String eName = scanner.nextLine();
            System.out.print("Enter Employee #" + (i + 1) + " salary: ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("Enter the employee number to search for: ");
        int searchENo = scanner.nextInt();
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.getENo() == searchENo) {
                System.out.println("Employee found:");
                System.out.println("Employee Number: " + emp.getENo());
                System.out.println("Employee Name: " + emp.getEName());
                System.out.println("Employee Salary: " + emp.getESalary());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Employee Number " + searchENo + " not found.");
        }

        scanner.close();
    }
}

