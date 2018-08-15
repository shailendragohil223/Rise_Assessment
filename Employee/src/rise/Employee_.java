/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
public class Employee_ {

    private final double EXP_GRET_3 = 0.05;
    private final double EXP_LESS_3 = 0.03;
    private final double IS_FEMALE = 0.02;

    private String name;
    private String gender;
    private double salary;
    private float experience;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    double IncrementOnTenK(double salary) {
        if (salary >= 10000) {
            return 0.15;
        } else {
            return 0.5;
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
            emp[loop] = new Employee_();
            
            System.out.println("Name:  ");
            String name = scan.next();
            emp[loop].setName(name);

            System.out.println("Experience: ");
            float experience = scan.nextFloat();
            emp[loop].setExperience(experience);

            System.out.println("Salary:  ");
            double salary = scan.nextDouble();
            emp[loop].setSalary(salary);

            System.out.println("Gender: ");
            String gender = scan.next();
            emp[loop].setGender(gender);
        }
        
        for (int loop = 0; loop < counter; loop++){
            InitialSalarySum += emp[loop].salary;
        }
        
        System.out.println("Before Appraisal CTC: "+ InitialSalarySum + "\n");
        
        for(int loop = 0; loop < counter; loop++){
            System.out.print(emp[loop].getName()+" will get: "+emp[loop].appraisal(emp[loop].getSalary(), emp[loop].getExperience(), emp[loop].getGender()));
            System.out.println("\n");
        }

    }

}
