package com.example.oop.basics.inheritance.polimorphism_basics;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void doWork() {
        System.out.println(" Doing work! ");
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee {
    private String departmentName;

    public Manager() {
        super();
        departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee() {
        System.out.println("Employee hired!");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise!");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printInfo() {
        System.out.println("Manager: " + getName());
    }
}

class Ceo extends Manager {
    private int sharesNumer;

    public Ceo() {
        sharesNumer = 100;
    }

    public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumer) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumer = sharesNumer;
    }

    public void signContract() {
        System.out.println("Contract signed!");
    }

    public int getSharesNumer() {
        return sharesNumer;
    }

    public void setSharesNumer(int sharesNumer) {
        this.sharesNumer = sharesNumer;
    }

    public void printInfo() {
        System.out.println("Ceo: " + getName());
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Jan", "Team Leader", 10000, "R&D");
        Ceo ceo = new Ceo("Rafał", "Prezes", 20000, "Board", 100);

        Employee worker = ceo;
        worker.doWork();
        worker.printInfo(); // Ceo: Rafał z klasy Ceo, wiązanie dynamiczne

        ceo.signContract();
        ceo.printInfo(); // Ceo: Rafał
        Manager person = ceo;
        person.hireEmployee();
        person.printInfo(); // Ceo: Rafał

    }
}
