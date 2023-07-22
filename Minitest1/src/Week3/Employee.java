package Week3;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    private Object x;

    public Employee(int id, String name, int age, int phoneNumber, String email, Address x) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.x = x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public abstract double totalSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", x=" + x +
                '}';
    }
}
