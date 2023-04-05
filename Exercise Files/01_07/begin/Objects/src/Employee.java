import java.util.jar.Attributes.Name;

public class Employee {
    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
        this.salary = this.salary * 1.05;
    }

}
