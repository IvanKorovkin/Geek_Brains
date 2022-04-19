package homework;

public class Employee {

    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee (String name, String position, String email, String phone, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printObject() {

        System.out.println("Name: " + name + ", position: " + position + ", email: " + email + ", phone: "
                + phone + ", salary: " + salary + ", age: " + age + "." );

    }

}
