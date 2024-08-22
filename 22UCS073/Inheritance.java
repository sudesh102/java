class Person {
    public String name;
    public int age;
    public String address;

    Person() {
        name = "";
        age = 0;
        address = "";
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Student extends Person {
    public String prn;
    public int m1, m2, m3;

    Student() {
        super(); // Call the parent constructor
        prn = "";
        m1 = m2 = m3 = 0;
    }

    Student(String name, int age, String address, String prn, int m1, int m2, int m3) {
        super(name, age, address); // Call the parent constructor to initialize inherited fields
        this.prn = prn;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.println("Name=" + name + " Age=" + age + " Address=" + address + " Prn=" + prn + " M1=" + m1 + " M2=" + m2 + " M3=" + m3);
    }
}

class Employee extends Person {
    public int emp_id;
    public float salary;

    Employee() {
        super(); // Call the parent constructor
        emp_id = 0;
        salary = 0.0f;
    }

    Employee(String name, int age, String address, int emp_id, float salary) {
        super(name, age, address); // Call the parent constructor to initialize inherited fields
        this.emp_id = emp_id;
        this.salary = salary;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 20, "Chadre", "22UCS100", 99, 99, 99);
        s1.display();
    }
}
