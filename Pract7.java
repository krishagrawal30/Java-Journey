
// Krish Agrawal
// E1 17
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Employee {
    private int employeeNumber;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeNumber, String employeeName, String designation, double salary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }
    public void increment() {
        if (designation.equalsIgnoreCase("Manager")) {

            salary += salary * 0.3;
        } else if (designation.equalsIgnoreCase("Salesman")) {
            salary += salary * 0.2;
        } else if (designation.equalsIgnoreCase("Clerk")) {
            salary += salary * 0.1;
        }
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %.2f", employeeNumber, employeeName, designation, salary);
    }
}

public class Pract7 {
    public static void main(String[] args) {
        String inputFileName = "Employee.txt";
        String outputFileName = "SalaryIncremented.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 4) {
                    int employeeNumber = Integer.parseInt(values[0].trim());
                    String employeeName = values[1].trim();
                    String designation = values[2].trim();
                    double salary = Double.parseDouble(values[3].trim());
                    Employee employee = new Employee(employeeNumber, employeeName, designation, salary);
                    employee.increment();
                    writer.write(employee.toString());
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            System.out.println("Employee details with updated salaries written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
        }
    }
}