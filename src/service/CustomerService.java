package service;

import model.Customer;

import java.lang.reflect.Array;
import java.util.*;

public class CustomerService {

    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    private static Map<String, Customer> customerMap = new HashMap<String, Customer>();

    public static void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        customerMap.put(email, customer);
    }

    public static Customer getCustomer (String customerEmail){
        return customerMap.get(customerEmail);
    }

    public static ArrayList<Customer> getAllCustomers(){
        return customers;
    }
}
