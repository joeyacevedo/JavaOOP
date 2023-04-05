public class Main {
    public static void main(String[] args){
        Employee Jane = new Employee("Jane", 22, 50000, "New York City");
        Employee Josh = new Employee("Josh", 23, 50000, "New York City");

        Josh.raiseSalary();
        System.out.println(Jane.salary);
        System.out.println(Josh.salary);
    }
}