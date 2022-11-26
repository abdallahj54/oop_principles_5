package oop_principles.encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        /*
        Create a company1 object and set all of its information
        Create a company2 object and set all of its information

        Company1 is -> Apple - California - (123) 312-2345
        Company2 is -> Google - California - (000) 055-5555

        Print the objects

        Print company names together with below message
        Company 1 is = "Apple" and Company 2 is = "Google"
         */

        Company company1 = new Company();
        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhone("(123) 312-2345");

        Company company2 = new Company("Google", "California", "(000) 055-5555");

        System.out.println(company1);
        System.out.println(company2);

        System.out.println("Company 1 is = " + "\"" + company1.getName() + "\""
                + " and company 2 is = " + "\"" + company2.getName() + "\"");
    }
}
