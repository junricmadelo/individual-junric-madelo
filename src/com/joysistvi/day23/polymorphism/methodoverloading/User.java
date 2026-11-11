package com.joysistvi.day23.polymorphism.methodoverloading;

public class User {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;




    public User(String firstName, String middleName, String lastName) {
        this.firstName = firstName;     // no rules, assign directly
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.setEmail(email);           // has rules, so use the setter
        this.setPassword(password);     // has rules, so use the setter
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public String getPassword() { return password; }


    public void setEmail(String email) {
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        boolean valid = at > 0
                && at == email.lastIndexOf('@')
                && dot > at + 1
                && dot < email.length() - 1
                && !email.contains(" ");

        if (valid) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");   // email stays null
        }
    }


    public void setPassword(String password) {
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        if (password.length() < 8) {
            System.out.println("Invalid password: must be at least 8 characters.");
        } else if (!hasUpper) {
            System.out.println("Invalid password: needs an uppercase letter.");
        } else if (!hasLower) {
            System.out.println("Invalid password: needs a lowercase letter.");
        } else if (!hasDigit) {
            System.out.println("Invalid password: needs a digit.");
        } else {
            this.password = password;
        }
    }


    @Override
    public String toString() {
        return "=== Account Details ===\n"
                + "Full Name: " + firstName + " " + middleName + " " + lastName + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }

}
