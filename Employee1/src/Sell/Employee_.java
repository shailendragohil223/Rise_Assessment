package Sell;

import java.util.Scanner;


public class Employee_ 
{

    private final double EXP_GRET_3 = 0.05;
    private final double EXP_LESS_3 = 0.03;
    private final double IS_FEMALE = 0.02;

    private final String name;
    private final String gender;
    private final double salary;
    private final float experience;

    public Employee_(String name, String gender, double salary, float experience) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public float getExperience() {
        return experience;
    }
    
    double IncrementOnTenK(double salary) {
        if (salary >= 10000) {
            return 0.015;
        } else {
            return 0.025;
        }
    }

    double appraisal(double salary, float exp, String gender) {
        double temp = 0;
        if ("F".equals(gender)) {
            temp += IS_FEMALE;
        }
        if (exp >= 3) {
            temp += EXP_GRET_3 + IncrementOnTenK(salary);
            salary += salary * temp;
            System.out.println("[increment" + temp + "]");
            return (salary);
        } else {
            temp += this.EXP_LESS_3 + IncrementOnTenK(salary);
            salary += salary * temp;
            System.out.println("[increment" + temp + "]");
            return (salary);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double InitialSalarySum = 0.0;

        System.out.println("How many employees: ");
        int counter = scan.nextInt();

        Employee_[] emp = new Employee_[counter];

        for (int loop = 0; loop < counter; loop++) {

            System.out.println("Name:  ");
            String name = scan.next();

            System.out.println("Experience: ");
            float experience = scan.nextFloat();

            System.out.println("Salary:  ");
            double salary = scan.nextDouble();

            System.out.println("Gender: ");
            String gender = scan.next();

            emp[loop] = new Employee_(name, gender, salary, experience);
        }

        for (int loop = 0; loop < counter; loop++) {
            InitialSalarySum += emp[loop].salary;
        }

        System.out.println("Before Appraisal CTC: " + InitialSalarySum + "\n");

        for (int loop = 0; loop < counter; loop++) {
            System.out.print(emp[loop].getName() + " will get: " + emp[loop].appraisal(emp[loop].getSalary(), emp[loop].getExperience(), emp[loop].getGender()));
            System.out.println("\n");
        }

    }

}