package oop_principles.encapsulation;

import java.util.Arrays;

public class EmployeeClub {
    public static void main(String[] args) {

        /*
        Create 2 companies as company1 and company2
        company1 -> Microsoft, Washington, (000) 123-1234
        company2 -> Apple, California, (000) 000-0000
         */

        Company company1 = new Company("Microsoft", "Washington", "(000) 123-1234");
        Company company2 = new Company("Apple", "California", "(000) 000-0000");

        Employee emp1 = new Employee("John Doe", "Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith", "Developer", 40, company2);
        Employee emp3 = new Employee("Jane Doe", "Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith", "Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold", "Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan", "Developer", 40, company1);

        /*
        Number of Employees for Apple -> 2
        Number of Employees for Microsoft -> 4
        Total number of Managers -> 1
        Total number of Developers -> 3
        Total number of Testers -> 2
        Number of Developers working for Microsoft -> 2
        Number of Developers working for Apple -> 1

        Find the youngest developer -> Jane is youngest with age = 20
        Find the oldest employee -> John is the oldest with the age = 45
         */

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

        System.out.println("----Count Apple and Microsoft Employees---");
        int totalAppleEmployee = 0;
        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Apple")) totalAppleEmployee++;
        }
        System.out.println(totalAppleEmployee); //2
        System.out.println(Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft")).count()); //4


        System.out.println("\n---Count Developer and Tester Employees---");
        int countDevelopers = 0;
        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer")) countDevelopers++;
        }
        System.out.println(countDevelopers); //3
        System.out.println(Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Tester")).count()); //2


        System.out.println("\n---Count Developer Employee number for Microsoft---");
        int devForMicrosoft = 0, testersForApple = 0;
        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer") && (employee.getCompany().getName().equals("Microsoft"))) devForMicrosoft++;
            if(employee.getJobPosition().equals("Tester") && (employee.getCompany().getName().equals("Apple"))) testersForApple++;
        }
        System.out.println(devForMicrosoft); //2
        System.out.println(testersForApple); //1


        System.out.println("\n---Find the Oldest Developer Working for Microsoft---");
        // E.O -> Matt is the oldest Developer working for Microsoft with the age = 40

        Employee oldestMicrosoftDev = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Microsoft")
            && employee.getJobPosition().equals("Developer")
            && employee.getAge() > oldestMicrosoftDev.getAge()) oldestMicrosoftDev = employee;
        }
        System.out.println(oldestMicrosoftDev);

        System.out.println(oldestMicrosoftDev.getFullName().split(" ")[0]
                + " is the oldest "
                + oldestMicrosoftDev.getJobPosition()
                + " working for "
                + oldestMicrosoftDev.getCompany().getName()
                + " with the age = "
                + oldestMicrosoftDev.getAge());
    }
}
