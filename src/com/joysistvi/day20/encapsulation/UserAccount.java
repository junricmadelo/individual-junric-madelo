package com.joysistvi.day20.encapsulation;

// Activity 14_Madelo Part 2
import java.util.regex.Pattern;

public class UserAccount {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final int MIN_PASSWORD_LENGTH = 8;

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount() {
    }

    // Parameterized constructor: calls the setters so every validation rule runs.
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setEmail(email);
        this.setPassword(password);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        if (middleName == null || middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    // Setters: an invalid value prints a message and the field keeps its old value (null if unset).
    public void setFirstName(String firstName) {
        if (isBlank(firstName)) {
            System.out.println("First name must not be empty.");
            return;
        }
        this.firstName = firstName.trim();
    }

    public void setMiddleName(String middleName) {
        // Middle name is optional
        this.middleName = middleName == null ? "" : middleName.trim();
    }

    public void setLastName(String lastName) {
        if (isBlank(lastName)) {
            System.out.println("Last name must not be empty.");
            return;
        }
        this.lastName = lastName.trim();
    }

    public void setAddress(String address) {
        if (isBlank(address)) {
            System.out.println("Address must not be empty.");
            return;
        }
        this.address = address.trim();
    }

    public void setEmail(String email) {
        if (isBlank(email) || !EMAIL_PATTERN.matcher(email.trim()).matches()) {
            System.out.println("Invalid email format.");
            return;
        }
        this.email = email.trim();
    }

    public void setPassword(String password) {
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long.");
            return;
        }
        if (password.contains(" ")) {
            System.out.println("Password must not contain spaces.");
            return;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasLetter || !hasDigit) {
            System.out.println("Password must contain at least one letter and one number.");
            return;
        }
        this.password = password;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    // The password is left out on purpose.
    @Override
    public String toString() {
        return "=== Account Details ===\n"
                + "Full Name: " + getFullName() + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }
}
