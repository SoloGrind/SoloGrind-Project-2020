package emailapp;

import java.util.Scanner;

public class Email {
    private String lastName;
    private String firstName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength = 8;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "Company.net";

    // Constructor to receive the last name and first name.
    public Email(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        System.out.println("email created: " + this.lastName + " " + this.firstName);

     // Call a method to choose a department then return the department of your choice.
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);


        email = lastName.toLowerCase() + "." + firstName.toLowerCase() + "@" + "Department" + "." + companySuffix;
    System.out.println("Your email: " + email);

    }

    // Ask for department
   private String setDepartment() {
        System.out.print("Select a department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your department here: ");
       Scanner input = new Scanner(System.in);
       int depChoice = input.nextInt();
       if (depChoice == 1) { return "Sales"; }
      else if (depChoice == 2) { return "Development"; }
      else if (depChoice == 3) { return "Accounting"; }
      else if (depChoice == 0) { return " "; }
      else { return " "; }

   }

   // Generate random password.
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
                return new String (password);
    }

    public void setEmailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
        }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    // to show info by printing it on the main System.out.println(start.showInfo);
    public String showInfo() {
        return "Display name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity: " + mailboxCapacity + " mb";
    }






}
