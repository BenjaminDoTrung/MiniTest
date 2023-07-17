package Week1;

public class Student {
    int name;
    int age;
    int nameClass;
    Student(){
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNameClass() {
        return nameClass;
    }

    public void setNameClass(int nameClass) {
        this.nameClass = nameClass;
    }
    public void display() {
        System.out.println("Name studen: " + name + ", age: " + age + ", class: " + nameClass);
    }
}
