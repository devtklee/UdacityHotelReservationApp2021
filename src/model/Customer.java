package model;

import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    public Customer (String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;

        if (isEmailValid(email) == true){
            this.email = email;
        } else {
            throw new IllegalArgumentException ("Invalid email type");
        }

    }

    public boolean isEmailValid (String email)  {

        boolean isValid = false;
        String emailRegex = "^(.+)@(.+)(.+)$";

        try {
            Pattern pattern = Pattern.compile(emailRegex);
            isValid = pattern.matcher(email).matches();
        } catch (IllegalArgumentException e){
            System.out.println(e.getLocalizedMessage());
        }

        return isValid;
    }

    @Override
    public String toString () {
        return "Customer \n First Name : " + firstName + "\n Last Name : " + lastName + "\n Email : " + email +"\n";
    }
}
