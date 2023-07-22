package Week3;

public class FullTimeEmployees extends Employee{
    private int bonus;
    private int moneyFine;
    private int hardSalary;

    public FullTimeEmployees(int id, String name, int age, int phoneNumber, String email,
                             Address x, int bonus, int moneyFine, int hardSalary) {
        super(id, name, age, phoneNumber, email, x);
        this.bonus = bonus;
        this.moneyFine = moneyFine;
        this.hardSalary = hardSalary;
    }
    public int salaryFullTime(){
        int salary = hardSalary + (bonus - moneyFine);
        System.out.println("Lương thực nhận: " + salary);
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMoneyFine() {
        return moneyFine;
    }

    public void setMoneyFine(int moneyFine) {
        this.moneyFine = moneyFine;
    }
    public double totalSalary() {
        return hardSalary + (bonus - moneyFine);
    }

    @Override
    public String toString() {
        return "FullTimeEmployees{" +
                "bonus=" + bonus +
                ", moneyFine=" + moneyFine +
                '}';
    }
}
