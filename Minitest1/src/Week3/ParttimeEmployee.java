package Week3;

import java.util.Date;

public class ParttimeEmployee extends Employee{
    private double workingHours;

    public ParttimeEmployee(int id, String name, int age, int phoneNumber, String email, Address x,
                            double workingHours) {
        super(id, name, age, phoneNumber, email, x);
        this.workingHours = workingHours;
    }
    public static void salaryPartTime(double hardSalary){
        double salaryPartTime = hardSalary * 100000;
        System.out.println("Lương thực nhận: " + salaryPartTime);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double totalSalary() {
        return workingHours * 100000;
    }
    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "workingHours=" + workingHours +
                '}';
    }
}
