package model;

public class Tester {

    public static void main(String[] args){

        //Test Case #1
        Customer customer = new Customer( "first", "last", "t@domain.com");
        System.out.println(customer);

        //Test Case #2
        Customer customer2 = new Customer( "test user 1", "last", "email");
        System.out.println(customer2);
    }
}
